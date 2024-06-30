package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.ProductosEntity;

public interface ProductosRepository extends JpaRepository<ProductosEntity, Long>{

}
