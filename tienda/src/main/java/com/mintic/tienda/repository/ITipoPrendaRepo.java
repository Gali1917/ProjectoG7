package com.mintic.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mintic.tienda.entity.TipoPrenda;

@Repository
public interface ITipoPrendaRepo extends JpaRepository<TipoPrenda, Integer>{
    
}
