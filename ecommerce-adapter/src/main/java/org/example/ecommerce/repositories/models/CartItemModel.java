package org.example.ecommerce.repositories.models;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CartItemModel extends BaseModel{
    private String code;
    private Long cartId;
    private String cartCode;
    private Long productId;
    private String productCode;
    private Double quantity;
    private Double totalPrice;
}