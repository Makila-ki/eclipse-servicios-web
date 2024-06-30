package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.Entity.ClienteEntity;

public interface ClientesRepository extends JpaRepository<ClienteEntity, Long>{

}
