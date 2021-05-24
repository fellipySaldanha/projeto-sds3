package com.fellipy.dsvendas.repositories;

import java.util.List;

import com.fellipy.dsvendas.dto.SalesSuccessDTO;
import com.fellipy.dsvendas.dto.SalesSumDTO;
import com.fellipy.dsvendas.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SaleRepository extends JpaRepository<Sale, Long>{
    
    @Query("SELECT new com.fellipy.dsvendas.dto.SalesSumDTO( obj.seller, SUM(obj.amount) ) FROM Sale AS obj GROUP BY obj.seller")
    List<SalesSumDTO> amountGroupBySeller();

    @Query("SELECT new com.fellipy.dsvendas.dto.SalesSuccessDTO( obj.seller, SUM(obj.visited), SUM(obj.deals) ) FROM Sale AS obj GROUP BY obj.seller")
    List<SalesSuccessDTO> successGroupBySeller();
}
