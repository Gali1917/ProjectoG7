package com.mintic.tienda.domain.moduleclothes.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mintic.tienda.domain.moduleclothes.IManageClothesDomain;
import com.mintic.tienda.service.DTO.PrendaDTO;
import com.mintic.tienda.service.moduleclothes.IManageClothesService;
import com.mintic.tienda.service.moduleclothes.exceptions.ManagerClothesException;


@Component
public class ManageClothesDomainImpl implements IManageClothesDomain{

   @Autowired
   private IManageClothesService iManageClothesService;

   public PrendaDTO savePrenda(PrendaDTO prendaDTO) throws ManagerClothesException {
      try {
         return iManageClothesService.savePrenda(prendaDTO);
      } catch (Exception e) {
         throw new ManagerClothesException(ManagerClothesException.PRENDA_NULL);
      }
    
   }
   
   public List<PrendaDTO> getAllPrendas() {
    return iManageClothesService.getAllPrendas();
   }

   public PrendaDTO getOnePrenda(Long idPrenda) throws ManagerClothesException {
    try {
      return iManageClothesService.getOnePrenda(idPrenda);
    } catch (Exception e) {
      throw new ManagerClothesException(ManagerClothesException.IDPRENDA_NULL);
    }
   }

   public void deletePrendaById(Long idPrenda) {
    iManageClothesService.deletePrendaById(idPrenda);
   }
}
