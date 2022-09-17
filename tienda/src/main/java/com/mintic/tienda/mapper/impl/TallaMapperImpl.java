package com.mintic.tienda.mapper.impl;

import com.mintic.tienda.entity.Talla;
import com.mintic.tienda.mapper.ITallaMapper;
import com.mintic.tienda.service.DTO.TallaDTO;

public class TallaMapperImpl implements ITallaMapper{

    @Override
    public Talla dTOToEntity(TallaDTO dto) {
        Talla talla = new Talla();
        talla.setIdTalla(dto.getIdTalla());
        talla.setTalla(dto.getTalla());
        return talla;
    }

    @Override
    public TallaDTO entityToDTO(Talla entity) {
        TallaDTO tallaDTO = new TallaDTO();
        tallaDTO.setIdTalla(entity.getIdTalla());
        tallaDTO.setTalla(entity.getTalla());
        return tallaDTO;
    }
    
}
