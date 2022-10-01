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
import com.mintic.tienda.service.moduleclothes.exceptions.ManagerClothesException;

@Service
public class ManageClothesServiceImpl implements IManageClothesService {

    @Autowired
    private IPrendaRepo prendaRepo;

    @Autowired
    private IPrendaMapper prendaMapper;

    @Override
    public PrendaDTO savePrenda(PrendaDTO prendaDTO) throws ManagerClothesException {
        try {
            Prenda prenda = prendaMapper.dTOToEntity(prendaDTO);
            prenda = prendaRepo.save(prenda);
            return prendaMapper.entityToDTO(prenda);
        } catch (Exception e) {
            throw new ManagerClothesException(ManagerClothesException.PRENDA_NULL);
        }
    }

    @Override
    public List<PrendaDTO> getAllPrendas() {
        return prendaRepo.findAllByOrderByIdDesc().stream().map(prendaMapper::entityToDTO).collect(Collectors.toList());
    }

    @Override
    public PrendaDTO getOnePrenda(Long idPrenda) throws ManagerClothesException {
        try {
            return prendaMapper.entityToDTO(prendaRepo.findById(idPrenda).orElseThrow());
        } catch (Exception e) {
            throw new ManagerClothesException(ManagerClothesException.IDPRENDA_NULL);
        }
    }

    @Override
    public void deletePrendaById(Long idPrenda) {
        prendaRepo.deleteById(idPrenda);
    }

}
