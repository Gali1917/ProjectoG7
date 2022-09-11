package com.mintic.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mintic.tienda.entity.FacturaPrenda;

@Repository
public interface IFacturaPrendaRepo extends JpaRepository<FacturaPrenda, Integer>{
    
}
