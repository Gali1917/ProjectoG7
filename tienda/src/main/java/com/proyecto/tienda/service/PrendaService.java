package com.proyecto.tienda.service;

import java.util.List;

import com.proyecto.tienda.Entity.Prenda;
import com.proyecto.tienda.Repository.IPrendaRepository;

public class PrendaService implements IPrendaService{

    private IPrendaRepository prendaRepository;

    public PrendaService(IPrendaRepository prendaRespository){
        this.prendaRepository = prendaRespository;
    }

    @Override
    public List<Prenda> getAllPrenda() {
        return prendaRepository.findAllPrendas();
    }

    @Override
    public List<Prenda> getWomen() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Prenda> getMan() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Prenda> getWomenTop() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Prenda> getWomenBottom() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Prenda> getWomenC() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Prenda> getManTop() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Prenda> getManBottom() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Prenda> getManC() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Prenda> getByName(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Prenda getById(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Prenda savePrenda(Prenda prenda) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Prenda setPrenda(Prenda prenda) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deletePrenda(Long id) {
        // TODO Auto-generated method stub
        
    }
    
}
