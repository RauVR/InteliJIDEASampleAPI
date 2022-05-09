package com.acme.sampleapi.production.persistence;

import com.acme.sampleapi.production.domain.model.Product;
import com.acme.sampleapi.production.domain.persistence.ProductRepository;

import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public Iterable<Product> findAll() {
        return List.of(new Product[]{
            new Product(1,"Sample name 1", "Sample description 1"),
                new Product(2,"Sample name 2", "Sample description2"),
        });
    }
}
