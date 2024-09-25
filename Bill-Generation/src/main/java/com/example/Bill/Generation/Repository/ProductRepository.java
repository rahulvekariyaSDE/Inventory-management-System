package com.example.Bill.Generation.Repository;

import com.example.Bill.Generation.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
