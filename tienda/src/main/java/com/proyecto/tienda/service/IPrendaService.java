package com.proyecto.tienda.service;

import java.util.List;

import com.proyecto.tienda.Entity.Prenda;

public interface IPrendaService {

    List<Prenda> getAllPrenda();

    List<Prenda> getWomen();

    List<Prenda> getMan();

    List<Prenda> getWomenTop();
    
    List<Prenda> getWomenBottom();

    List<Prenda> getWomenC();

    List<Prenda> getManTop();

    List<Prenda> getManBottom();

    List<Prenda> getManC();

    List<Prenda> getByName(String name);

    Prenda getById(long id);

    Prenda savePrenda(Prenda prenda);

    Prenda setPrenda(Prenda prenda);

    void deletePrenda(Long id);
    
}
