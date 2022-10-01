package com.mintic.tienda.domain.moduleclothes.impl;


import com.mintic.tienda.domain.moduleclothes.IManageClothesDomain;
import com.mintic.tienda.domain.moduleclothes.exceptions.ManageClothesDomainException;
import com.mintic.tienda.service.DTO.PrendaDTO;


public class ManageClothesDomainImpl implements IManageClothesDomain{

   private static final Long MINIMAL_PRICE = 1000L;
   private static final Integer MINIMUM_QUANTITY_OF_CLOTHING = 10;


   @Override
   public void validatePrenda(PrendaDTO prendaDTO) throws ManageClothesDomainException {

      Long price = prendaDTO.getPrecio();

      if(price < MINIMAL_PRICE) {
         throw new ManageClothesDomainException(ManageClothesDomainException.MINIMUM_PRICE_MESSAGE);
      }

      int quantity = prendaDTO.getCantidad();

      if(quantity < MINIMUM_QUANTITY_OF_CLOTHING) {
         throw new ManageClothesDomainException(ManageClothesDomainException.MESSAGE_MINIMUM_QUANTITY);
      }

      String typeOfClothing = prendaDTO.getTipoPrenda();

      if(typeOfClothing.isEmpty() || typeOfClothing.isBlank()) {
         throw new ManageClothesDomainException(ManageClothesDomainException.TYPE_OF_CLOTHING_IS_NECESSARY);
      }
   }

}
