package com.mintic.tienda.service.moduleclothes.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mintic.tienda.entity.Prenda;
import com.mintic.tienda.mapper.IPrendaMapper;
import com.mintic.tienda.repository.IPrendaRepo;
import com.mintic.tienda.service.DTO.PrendaDTO;
import com.mintic.tienda.service.moduleclothes.IManageClothesService;

@Service
public class ManageClothesServiceImpl implements IManageClothesService {
    
    @Autowired
    private IPrendaRepo prendaRepo;

    @Autowired
    private IPrendaMapper prendaMapper;


    @Override
    public PrendaDTO savePrenda(PrendaDTO prendaDTO) {
        Prenda prenda = prendaMapper.dTOToEntity(prendaDTO);
        prenda = prendaRepo.save(prenda);
        return prendaMapper.entityToDTO(prenda);
    }

    @Override
    public List<PrendaDTO> getAllPrendas() {
        return prendaRepo.findAllByOrderByIdDesc().stream().map(prendaMapper::entityToDTO).collect(Collectors.toList());
    }

    @Override
    public PrendaDTO getOnePrenda(Long idPrenda) {
        return prendaMapper.entityToDTO(prendaRepo.findById(idPrenda).orElseThrow());
    }

    @Override
    public void deletePrendaById(Long idPrenda) {
        prendaRepo.deleteById(idPrenda); 
    } 
    
}
