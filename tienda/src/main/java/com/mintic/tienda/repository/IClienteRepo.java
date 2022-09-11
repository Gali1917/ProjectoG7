package com.mintic.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mintic.tienda.entity.Cliente;

@Repository
public interface IClienteRepo extends JpaRepository<Cliente, Integer> {
    
}
