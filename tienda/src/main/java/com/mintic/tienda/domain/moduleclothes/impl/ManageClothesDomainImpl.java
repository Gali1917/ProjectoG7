package com.mintic.tienda.domain.moduleclothes.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mintic.tienda.domain.moduleclothes.IManageClothesDomain;
import com.mintic.tienda.entity.Prenda;
import com.mintic.tienda.service.DTO.PrendaDTO;
import com.mintic.tienda.service.moduleclothes.IManageClothesService;


@Component
public class ManageClothesDomainImpl implements IManageClothesDomain{

   @Autowired
   private IManageClothesService iManageClothesService;

   public PrendaDTO savePrenda(PrendaDTO prendaDTO) {
    return iManageClothesService.savePrenda(prendaDTO);
   }
   
   public List<PrendaDTO> getAllPrendas() {
    return iManageClothesService.getAllPrendas();
   }

   

   public PrendaDTO getOnePrenda(Long idPrenda) {
    return iManageClothesService.getOnePrenda(idPrenda);
   }

   public void deletePrendaById(Long idPrenda) {
    iManageClothesService.deletePrendaById(idPrenda);
   }
}
