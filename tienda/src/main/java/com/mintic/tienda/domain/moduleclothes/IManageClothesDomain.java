package com.mintic.tienda.domain.moduleclothes;

import com.mintic.tienda.domain.moduleclothes.exceptions.ManageClothesDomainException;
import com.mintic.tienda.service.DTO.PrendaDTO;

public interface IManageClothesDomain {

    public void validatePrenda(PrendaDTO prendaDTO) throws ManageClothesDomainException;
}
