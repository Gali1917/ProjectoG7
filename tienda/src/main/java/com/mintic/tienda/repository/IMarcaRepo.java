package com.mintic.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mintic.tienda.entity.Marca;

@Repository
public interface IMarcaRepo extends JpaRepository<Marca, Integer>{
    
}
