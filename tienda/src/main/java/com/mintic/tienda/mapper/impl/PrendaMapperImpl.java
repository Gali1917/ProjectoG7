package com.mintic.tienda.mapper.impl;

import com.mintic.tienda.entity.Prenda;
import com.mintic.tienda.mapper.IPrendaMapper;
import com.mintic.tienda.service.DTO.PrendaDTO;

public class PrendaMapperImpl implements IPrendaMapper {

    @Override
    public Prenda dTOToEntity(PrendaDTO dto) {
        Prenda prenda = new Prenda();
        prenda.setIdPrenda(dto.getIdPrenda());
        prenda.setNombre(dto.getNombre());
        prenda.setIdTalla(dto.getIdTalla());
        prenda.setIdTipoPrenda(dto.getIdTipoPrenda());
        prenda.setIdGenero(dto.getIdGenero());
        prenda.setPrecio(dto.getPrecio());
        prenda.setIdMarca(dto.getIdMarca());
        prenda.setDetalle(dto.getDetalle());
        prenda.setCantidad(dto.getCantidad());
        prenda.setImagen(dto.getImagen());
        return prenda;
    }

    @Override
    public PrendaDTO entityToDTO(Prenda entity) {
        PrendaDTO prendaDTO = new PrendaDTO();
        prendaDTO.setIdPrenda(entity.getIdPrenda());
        prendaDTO.setNombre(entity.getNombre());
        prendaDTO.setIdTalla(entity.getIdTalla());
        prendaDTO.setIdTipoPrenda(entity.getIdTipoPrenda());
        prendaDTO.setIdGenero(entity.getIdGenero());
        prendaDTO.setPrecio(entity.getPrecio());
        prendaDTO.setIdMarca(entity.getIdMarca());
        prendaDTO.setDetalle(entity.getDetalle());
        prendaDTO.setCantidad(entity.getCantidad());
        prendaDTO.setImagen(entity.getImagen());
        return prendaDTO;
    }
    
}
