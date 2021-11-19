package org.example.ecommerce.repositories.models;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CouponModel extends BaseModel{
    private String code;
    private Double percent;
    private int status;
}
