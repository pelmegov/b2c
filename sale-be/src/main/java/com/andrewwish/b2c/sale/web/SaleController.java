package com.andrewwish.b2c.sale.web;

import com.andrewwish.b2c.sale.model.SaleEntity;
import com.andrewwish.b2c.sale.service.SaleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class SaleController {

    private SaleService saleService;

    @GetMapping("/sale-api/v1/sales/{saleId}")
    public SaleEntity getSale(@PathVariable long saleId) {
        return saleService.getSale(saleId);
    }

    @PostMapping("/sale-api/v1/sales")
    public SaleEntity postSale(@RequestBody SaleEntity sale) {
        return saleService.postSale(sale);
    }
}
