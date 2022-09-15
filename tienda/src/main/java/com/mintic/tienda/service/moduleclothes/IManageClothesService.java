package com.mintic.tienda.service.moduleclothes;

import java.util.List;

import com.mintic.tienda.domain.moduleclothes.IManageClothesDomain;
import com.mintic.tienda.entity.Prenda;

public interface IManageClothesService extends IManageClothesDomain {
    
   Prenda savePrenda(Prenda prenda);

   List<Prenda> getAllPrendas();

   Prenda updatePrenda(Prenda prenda, Integer idPrenda);

   void deletePrendaById(Integer idPrenda);
}
