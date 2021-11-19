package org.example.ecommerce.repositories.models;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CategoryModel extends BaseModel{
    private String code;
    private String name;
    private String img;
    private int status;
    private Double totalProduct;
}
