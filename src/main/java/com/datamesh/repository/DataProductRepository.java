package com.datamesh.repository;

import com.datamesh.model.DataProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataProductRepository extends JpaRepository<DataProduct, Long> {
}