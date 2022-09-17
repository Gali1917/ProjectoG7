package com.mintic.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mintic.tienda.entity.Factura;

@Repository
public interface IFacturaRepo extends JpaRepository<Factura, Long>{
    
}