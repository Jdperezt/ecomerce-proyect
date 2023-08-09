package com.ecomerceproyect.service;

import com.ecomerceproyect.model.Product;

import java.util.Optional;

public interface ProductService {
    public Product save(Product product);
    Optional<Product> get(Integer id);
    void update(Product product);
    void delete(Integer id);


}
