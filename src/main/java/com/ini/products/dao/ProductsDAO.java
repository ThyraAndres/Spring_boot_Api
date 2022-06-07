package com.ini.products.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ini.products.entitys.Product;

public interface ProductsDAO extends JpaRepository<Product, Long>{
	

}
