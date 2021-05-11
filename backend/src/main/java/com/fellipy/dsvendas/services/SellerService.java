package com.fellipy.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import com.fellipy.dsvendas.dto.SellerDTO;
import com.fellipy.dsvendas.entities.Seller;
import com.fellipy.dsvendas.repositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll(){
        List<Seller> result = repository.findAll();
        return result.stream().map(sellerResult -> new SellerDTO(sellerResult)).collect(Collectors.toList());
    }
    
}
