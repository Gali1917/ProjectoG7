package com.mintic.tienda.domain.moduleclothes.impl;

import java.util.List;

import com.mintic.tienda.domain.moduleclothes.IManageClothesDomain;
import com.mintic.tienda.service.DTO.PrendaDTO;
import com.mintic.tienda.service.moduleclothes.IManageClothesService;


public class ManageClothesDomainImpl implements IManageClothesDomain{

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
