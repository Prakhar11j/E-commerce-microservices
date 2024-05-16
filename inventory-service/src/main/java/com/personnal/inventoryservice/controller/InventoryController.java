package com.personnal.inventoryservice.controller;

import com.personnal.inventoryservice.dto.InventoryResponse;
import com.personnal.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory/")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    // http://localhost:8082/api/inventory?skuCode=iphone-13&skuCode=iphone-13-red
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
        System.out.println("hello worlds");
        return inventoryService.isInStock(skuCode);
    }
}
