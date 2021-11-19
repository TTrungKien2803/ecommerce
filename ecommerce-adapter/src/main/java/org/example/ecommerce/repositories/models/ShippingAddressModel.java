package org.example.ecommerce.repositories.models;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShippingAddressModel extends BaseModel{
    private String code;
    private Long userId;
    private String userCode;
    private String receiverName;
    private String receiverPhone;
    private String receiverAddress;
    private int status;
}
