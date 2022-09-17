package com.mintic.tienda.service.moduleclothes;

import java.util.List;

import com.mintic.tienda.domain.moduleclothes.IManageClothesDomain;
import com.mintic.tienda.entity.Prenda;
import com.mintic.tienda.service.DTO.PrendaDTO;

public interface IManageClothesService extends IManageClothesDomain {
    
   Prenda savePrenda(Prenda prenda);

   List<Prenda> getAllPrendas();

   Prenda getOnePrenda(Long idPrenda);

   Prenda updatePrenda(Prenda prenda);

   void deletePrendaById(Long idPrenda);
}
