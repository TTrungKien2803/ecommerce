package org.example.ecommerce.repositories.models;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class OrderModel extends BaseModel{
    private String Code;
    private Long userId;
    private String userCode;
    private int status;
    private String cancel_reason;
    private String note;
    private Long shippingId;
    private String ShippingCode;
    private Double totalPrice;
}
