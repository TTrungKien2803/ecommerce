package org.example.ecommerce.repositories.mappers;

import java.util.List;
import org.example.ecommerce.domains.entities.Product;
import org.example.ecommerce.repositories.models.ProductModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class ProductMapper {
    public final static ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    public abstract Product toEntity (ProductModel model);

    public abstract List<Product> toEntities (List<ProductModel> model);
}
