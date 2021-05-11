package com.fellipy.dsvendas.repositories;

import com.fellipy.dsvendas.entities.Seller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long>{
    
}
