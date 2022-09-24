package com.mintic.tienda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.mintic.tienda.entity.Prenda;
// import com.mintic.tienda.service.DTO.PrendaDTO;

@Repository
public interface IPrendaRepo extends JpaRepository<Prenda, Long>{

    

}
