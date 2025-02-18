package com.datamesh.controller;

import com.datamesh.model.DataProduct;
import com.datamesh.service.DataProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/data-products")
public class DataProductController {

    @Autowired
    private DataProductService dataProductService;

    @GetMapping
    public List<DataProduct> getAllDataProducts() {
        return dataProductService.getAllDataProducts();
    }

    @PostMapping
    public DataProduct createDataProduct(@RequestBody DataProduct dataProduct) {
        return dataProductService.createDataProduct(dataProduct);
    }
}