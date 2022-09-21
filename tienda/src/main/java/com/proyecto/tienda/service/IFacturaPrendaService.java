package com.proyecto.tienda.service;

import java.util.List;

import com.proyecto.tienda.Entity.FacturaPrenda;

public interface IFacturaPrendaService {
    
    List<FacturaPrenda> getAllFacturaPrenda();
    
    List<FacturaPrenda> getFacturaPrendaByName(String name);

    FacturaPrenda saveFacturaPrenda(FacturaPrenda facturaPrenda);

    FacturaPrenda getFacturaPrendaById(Long id);

}
