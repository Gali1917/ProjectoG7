package com.mintic.tienda.service.moduleclothes;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.mintic.tienda.domain.moduleclothes.IManageClothesDomain;
import com.mintic.tienda.service.DTO.PrendaDTO;

public interface IManageClothesService extends IManageClothesDomain {
    
   PrendaDTO savePrenda(PrendaDTO prendaDTO);

   
   List<PrendaDTO> getAllPrendas();

   PrendaDTO getOnePrenda(Long idPrenda);

   void deletePrendaById(Long idPrenda);
}
