package com.mintic.tienda.mapper.impl;

import com.mintic.tienda.entity.Marca;
import com.mintic.tienda.mapper.IMarcaMapper;
import com.mintic.tienda.service.DTO.MarcaDTO;

public class MarcaMapperImpl implements IMarcaMapper {

    @Override
    public Marca dTOToEntity(MarcaDTO dto) {
        Marca marca = new Marca();
        marca.setIdMarca(dto.getIdMarca());
        marca.setDescripcion(dto.getDescripcion());
        return marca;
    }

    @Override
    public MarcaDTO entityToDTO(Marca entity) {
        MarcaDTO marcaDTO = new MarcaDTO();
        marcaDTO.setIdMarca(entity.getIdMarca());
        marcaDTO.setDescripcion(entity.getDescripcion());
        return marcaDTO;
    }
    
}
