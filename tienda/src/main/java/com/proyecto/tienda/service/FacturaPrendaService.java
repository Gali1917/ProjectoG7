package com.proyecto.tienda.service;

import java.util.List;

import com.proyecto.tienda.Entity.FacturaPrenda;
import com.proyecto.tienda.Repository.IFacturaPrendaRepository;

public class FacturaPrendaService implements IFacturaPrendaService{

    private IFacturaPrendaRepository facturaPrendaRepository;

    public FacturaPrendaService(IFacturaPrendaRepository facturaPrendaRepository){
        this.facturaPrendaRepository = facturaPrendaRepository;
    }

    @Override
    public List<FacturaPrenda> getAllFacturaPrenda() {
        return facturaPrendaRepository.findAllFacturaPrenda();
    }

    @Override
    public List<FacturaPrenda> getFacturaPrendaByName(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public FacturaPrenda saveFacturaPrenda(FacturaPrenda facturaPrenda) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public FacturaPrenda getFacturaPrendaById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }
    
    
}
