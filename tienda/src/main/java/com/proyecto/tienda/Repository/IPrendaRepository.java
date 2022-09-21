package com.proyecto.tienda.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyecto.tienda.Entity.Prenda;

public interface IPrendaRepository extends JpaRepository<Prenda, Long>{
    
    @Query("SELECT * FROM prenda p ORDER BY id_prenda ASC")
    public List<Prenda> findAllPrendas();
}
