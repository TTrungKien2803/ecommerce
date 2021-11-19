package org.example.ecommerce.repositories.models;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CartModel extends BaseModel{
    private String code;
    private Long userId;
    private String userCode;
}
