package com.mintic.tienda.mapper.impl;

import com.mintic.tienda.entity.Rol;
import com.mintic.tienda.mapper.IRolMapper;
import com.mintic.tienda.service.DTO.RolDTO;

public class RolMapperImpl implements IRolMapper{

    @Override
    public Rol dTOToEntity(RolDTO dto) {
        Rol rol = new Rol();
        rol.setIdRol(dto.getIdRol());
        rol.setTipoRol(dto.getTipoRol());
        return rol;
    }

    @Override
    public RolDTO entityToDTO(Rol entity) {
        RolDTO rolDTO = new RolDTO();
        rolDTO.setIdRol(entity.getIdRol());
        rolDTO.setTipoRol(entity.getTipoRol());
        return rolDTO;
    }
    
}
