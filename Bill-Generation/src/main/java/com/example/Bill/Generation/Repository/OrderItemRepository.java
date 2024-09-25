package com.example.Bill.Generation.Repository;

import com.example.Bill.Generation.Model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
