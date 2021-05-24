package com.fellipy.dsvendas.controllers;

import java.util.List;

import com.fellipy.dsvendas.dto.SaleDTO;
import com.fellipy.dsvendas.dto.SalesSuccessDTO;
import com.fellipy.dsvendas.dto.SalesSumDTO;
import com.fellipy.dsvendas.services.SaleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){     
        Page<SaleDTO> pageSales = service.findAll(pageable);
        return ResponseEntity.ok(pageSales);
    }

    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SalesSumDTO>> amountGroupBySeller(){     
        List<SalesSumDTO> listSalesSum = service.amountGroupBySeller();
        return ResponseEntity.ok(listSalesSum);
    }

    @GetMapping(value = "/success-by-seller")
    public ResponseEntity<List<SalesSuccessDTO>> successGroupBySeller(){     
        List<SalesSuccessDTO> listSalesSum = service.successGroupBySeller();
        return ResponseEntity.ok(listSalesSum);
    }

}
