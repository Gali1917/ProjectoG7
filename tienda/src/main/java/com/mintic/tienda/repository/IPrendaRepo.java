package com.mintic.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mintic.tienda.entity.Prenda;

@Repository
public interface IPrendaRepo extends JpaRepository<Prenda, Long>{
    
}
