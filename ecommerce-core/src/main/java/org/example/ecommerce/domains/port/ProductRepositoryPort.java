package org.example.ecommerce.domains.port;

import java.util.List;
import org.example.ecommerce.domains.entities.Product;

public interface ProductRepositoryPort {
    List<Product> findAll();
}
