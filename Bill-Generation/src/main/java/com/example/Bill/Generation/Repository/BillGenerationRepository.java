package com.example.Bill.Generation.Repository;

import com.example.Bill.Generation.Model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillGenerationRepository extends JpaRepository<Bill,Long> {
}
