package com.fellipy.dsvendas.controllers;

import java.util.List;

import com.fellipy.dsvendas.dto.SellerDTO;
import com.fellipy.dsvendas.services.SellerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

    @Autowired
    private SellerService service;

    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll(){
        List<SellerDTO> listSellers = service.findAll();
        return ResponseEntity.ok(listSellers);
    }

}
