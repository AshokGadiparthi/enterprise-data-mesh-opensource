package com.datamesh.service;

import com.datamesh.model.DataProduct;
import com.datamesh.repository.DataProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataProductService {

    @Autowired
    private DataProductRepository dataProductRepository;

    public List<DataProduct> getAllDataProducts() {
        return dataProductRepository.findAll();
    }

    public DataProduct createDataProduct(DataProduct dataProduct) {
        return dataProductRepository.save(dataProduct);
    }
}