package org.example.ecommerce.repositories.models;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CouponProductMappingModel extends BaseModel{
    private Long couponId;
    private String couponCode;
    private Long productId;
    private String productCode;
}
