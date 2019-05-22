package com.hcl.shopperscard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.shopperscard.entity.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {

}
