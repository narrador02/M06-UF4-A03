package com.accesadades.botiga.Repository;

import com.accesadades.botiga.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Set;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContainingIgnoreCase(String name);
    Product findByName(String name);
    Set<Product> findByNameAndPrice(String name, float price);
}