package com.mintic.tienda.service.moduleclothes;

import java.util.List;


import com.mintic.tienda.domain.moduleclothes.IManageClothesDomain;
import com.mintic.tienda.service.DTO.PrendaDTO;
import com.mintic.tienda.service.moduleclothes.exceptions.ManagerClothesException;

public interface IManageClothesService extends IManageClothesDomain {
    
   PrendaDTO savePrenda(PrendaDTO prendaDTO) throws ManagerClothesException;
   
   List<PrendaDTO> getAllPrendas();

   PrendaDTO getOnePrenda(Long idPrenda) throws ManagerClothesException;

   void deletePrendaById(Long idPrenda);
}
