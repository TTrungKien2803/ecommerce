package org.example.ecommerce.domains.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductFilterRequest {
    private Long since;
    private Long until;
    private String name;
    private Double price;
    private String categoryCode;
    private String brandCode;
}
