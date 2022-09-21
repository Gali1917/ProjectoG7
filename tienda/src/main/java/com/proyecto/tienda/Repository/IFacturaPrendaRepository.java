package com.proyecto.tienda.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyecto.tienda.Entity.FacturaPrenda;

public interface IFacturaPrendaRepository extends JpaRepository<FacturaPrenda, Long>{
    
    @Query("SELECT * FROM factura_prenda ORDER BY id_factura_prenda ASC")
    public List<FacturaPrenda> findAllFacturaPrenda();
}
