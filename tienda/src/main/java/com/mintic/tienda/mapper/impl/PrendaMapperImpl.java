package com.mintic.tienda.mapper.impl;

import org.springframework.stereotype.Component;
import com.mintic.tienda.entity.Prenda;
import com.mintic.tienda.mapper.IPrendaMapper;
import com.mintic.tienda.service.DTO.PrendaDTO;

@Component
public class PrendaMapperImpl implements IPrendaMapper {

    @Override
    public Prenda dTOToEntity(PrendaDTO dto) {
        Prenda prenda = new Prenda();
        prenda.setId(dto.getId());
        prenda.setNombre(dto.getNombre());
        prenda.setTalla(dto.getTalla());
        prenda.setTipoPrenda(dto.getTipoPrenda());
        prenda.setGenero(dto.getGenero());
        prenda.setPrecio(dto.getPrecio());
        prenda.setMarca(dto.getMarca());
        prenda.setDetalle(dto.getDetalle());
        prenda.setCantidad(dto.getCantidad());
        prenda.setImagen(dto.getImagen());
        return prenda;
    }

    @Override
    public PrendaDTO entityToDTO(Prenda entity) {
        PrendaDTO prendaDTO = new PrendaDTO();
        prendaDTO.setId(entity.getId());
        prendaDTO.setNombre(entity.getNombre());
        prendaDTO.setTalla(entity.getTalla());
        prendaDTO.setTipoPrenda(entity.getTipoPrenda());
        prendaDTO.setGenero(entity.getGenero());
        prendaDTO.setPrecio(entity.getPrecio());
        prendaDTO.setMarca(entity.getMarca());
        prendaDTO.setDetalle(entity.getDetalle());
        prendaDTO.setCantidad(entity.getCantidad());
        prendaDTO.setImagen(entity.getImagen());
        return prendaDTO;
    }
    
}
