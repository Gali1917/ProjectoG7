package com.mintic.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mintic.tienda.entity.Talla;

@Repository
public interface ITallaRepo extends JpaRepository<Talla, Long>{
    
}
