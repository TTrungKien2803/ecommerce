package org.example.ecommerce.repositories.models;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ProductModel extends BaseModel{
    private String code;
    private String name;
    private int status;
    private String img;
    private String description;
    private Long categoryId;
    private String categoryCode;
    private Long brandId;
    private String brandCode;
    private int position;
    private Double price;
}
