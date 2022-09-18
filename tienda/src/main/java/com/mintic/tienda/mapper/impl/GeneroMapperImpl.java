package com.mintic.tienda.mapper.impl;

import org.springframework.stereotype.Component;
import com.mintic.tienda.entity.Genero;
import com.mintic.tienda.mapper.IGeneroMapper;
import com.mintic.tienda.service.DTO.GeneroDTO;

@Component
public class GeneroMapperImpl implements IGeneroMapper{

    @Override
    public Genero dTOToEntity(GeneroDTO dto) {
        Genero genero = new Genero();
        genero.setIdGenero(dto.getIdGenero());
        genero.setDescripcion(dto.getDescripcion());
        return genero;
    }

    @Override
    public GeneroDTO entityToDTO(Genero entity) {
        GeneroDTO generoDTO = new GeneroDTO();
        generoDTO.setIdGenero(entity.getIdGenero());
        generoDTO.setDescripcion(entity.getDescripcion());
        return generoDTO;
    }
    
}
