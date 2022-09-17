package com.mintic.tienda.service.moduleclothes.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mintic.tienda.entity.Prenda;
import com.mintic.tienda.repository.IPrendaRepo;
import com.mintic.tienda.service.moduleclothes.IManageClothesService;

@Service
public class ManageClothesServiceImpl implements IManageClothesService {
    
    @Autowired
    private IPrendaRepo prendaRepo;


    @Override
    public Prenda savePrenda(Prenda prenda) {
        return prendaRepo.save(prenda);
    }

    @Override
    public List<Prenda> getAllPrendas() {
        return prendaRepo.findAll();
    }

    @Override
    public Prenda updatePrenda(Prenda prenda, Long idPrenda) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deletePrendaById(Long idPrenda) {
        prendaRepo.deleteById(idPrenda); 
    }
    
    

}
