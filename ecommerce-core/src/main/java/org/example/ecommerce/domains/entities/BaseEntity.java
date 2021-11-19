package org.example.ecommerce.domains.entities;

import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseEntity {
    private Long id;
    private Instant createAt;
    private Instant updateAt;
}
