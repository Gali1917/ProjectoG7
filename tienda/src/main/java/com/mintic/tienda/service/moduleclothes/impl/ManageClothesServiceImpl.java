package com.mintic.tienda.service.moduleclothes.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mintic.tienda.entity.Prenda;
import com.mintic.tienda.mapper.impl.ClienteMapperImpl;
import com.mintic.tienda.repository.IPrendaRepo;
import com.mintic.tienda.service.DTO.PrendaDTO;
import com.mintic.tienda.service.moduleclothes.IManageClothesService;

@Service
public class ManageClothesServiceImpl implements IManageClothesService {
    
    @Autowired
    private IPrendaRepo prendaRepo;

    @Autowired
    private ClienteMapperImpl prendaMapper; // ACA DEBE IR EL MAPPER DE PRENDA


    @Override
    public Prenda savePrenda(Prenda prenda) {
        return prendaRepo.save(prenda);
    }

    @Override
    public List<Prenda> getAllPrendas() {
        return prendaRepo.findAll();
    }

    @Override
    public Prenda getOnePrenda(Long idPrenda) {
        return prendaRepo.findById(idPrenda).orElseThrow();
    }

    @Override
    public Prenda updatePrenda(Prenda prenda) {
        return prendaRepo.save(prenda);
    }

    @Override
    public void deletePrendaById(Long idPrenda) {
        prendaRepo.deleteById(idPrenda); 
    } 
    
}
