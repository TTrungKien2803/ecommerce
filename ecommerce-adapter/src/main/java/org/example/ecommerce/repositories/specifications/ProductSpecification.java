package org.example.ecommerce.repositories.specifications;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.example.ecommerce.domains.request.ProductFilterRequest;
import org.example.ecommerce.repositories.models.ProductModel;
import org.springframework.data.jpa.domain.Specification;

public class ProductSpecification implements Specification<ProductModel> {
    private ProductFilterRequest filter;

    public ProductSpecification(ProductFilterRequest filter){
        this.filter = filter;
    }
    @Override
    public Predicate toPredicate(Root<ProductModel> root, CriteriaQuery<?> query,
        CriteriaBuilder criteriaBuilder) {

        List<Predicate> predicates = new ArrayList<>();

        if (filter.getSince() != null){
            predicates.add(criteriaBuilder.greaterThan(root.get("id"), filter.getSince()));
        } else if (filter.getUntil() != null){
            predicates.add(criteriaBuilder.lessThan(root.get("id"), filter.getUntil()));
        }

        if (filter.getName() != null) {
            predicates.add(criteriaBuilder.like(root.get("name"), "%".concat(filter.getName()).concat("%")));
        }

        if (filter.getCategoryCode() != null){
            predicates.add(criteriaBuilder.equal(root.get("categoryCode"), filter.getCategoryCode()));
        }

        return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
    }
}
