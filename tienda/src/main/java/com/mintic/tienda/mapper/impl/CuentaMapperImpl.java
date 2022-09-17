package com.mintic.tienda.mapper.impl;

import com.mintic.tienda.entity.Cuenta;
import com.mintic.tienda.mapper.ICuentaMapper;
import com.mintic.tienda.service.DTO.CuentaDTO;

public class CuentaMapperImpl implements ICuentaMapper{

    @Override
    public Cuenta dTOToEntity(CuentaDTO dto) {
        Cuenta cuenta = new Cuenta();
        cuenta.setIdCuenta(dto.getIdCuenta());
        cuenta.setUser(dto.getUser());
        cuenta.setPass(dto.getPass());
        cuenta.setIdRol(dto.getIdRol());
        return cuenta;
    }

    @Override
    public CuentaDTO entityToDTO(Cuenta entity) {
        CuentaDTO cuentaDTO = new CuentaDTO();
        cuentaDTO.setIdCuenta(entity.getIdCuenta());
        cuentaDTO.setUser(entity.getUser());
        cuentaDTO.setPass(entity.getPass());
        cuentaDTO.setIdRol(entity.getIdRol());
        return cuentaDTO;
    }
    
}
