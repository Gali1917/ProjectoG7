package com.mintic.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mintic.tienda.entity.Genero;

@Repository
public interface IGeneroRepo extends JpaRepository<Genero, Long>{
    
}