package com.fellipy.dsvendas.repositories;

import com.fellipy.dsvendas.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long>{
    
}
