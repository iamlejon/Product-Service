package com.learning.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.springcloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

	Product findByName(String name);

}
