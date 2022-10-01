package com.mintic.tienda.service.moduleclothes;

import java.util.List;

import com.mintic.tienda.domain.moduleclothes.exceptions.ManageClothesDomainException;
import com.mintic.tienda.service.DTO.PrendaDTO;
import com.mintic.tienda.service.moduleclothes.exceptions.ManagerClothesServiceException;

public interface IManageClothesService {
    
   PrendaDTO savePrenda(PrendaDTO prendaDTO) throws ManagerClothesServiceException, ManageClothesDomainException;
   
   List<PrendaDTO> getAllPrendas();

   PrendaDTO getOnePrenda(Long idPrenda) throws ManagerClothesServiceException;

   void deletePrendaById(Long idPrenda);
}
