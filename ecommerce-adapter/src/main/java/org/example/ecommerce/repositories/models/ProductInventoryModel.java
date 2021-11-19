package org.example.ecommerce.repositories.models;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ProductInventoryModel extends BaseModel {
    private String code;
    private Long productId;
    private String productCode;
    private Double amount;
    private Double available;
    private Double safetyStock;
    private Double committed;
    private Double incoming;
    private Double totalValue;
}
