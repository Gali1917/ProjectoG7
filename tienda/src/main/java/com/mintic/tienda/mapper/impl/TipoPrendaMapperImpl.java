package com.mintic.tienda.mapper.impl;

import com.mintic.tienda.entity.TipoPrenda;
import com.mintic.tienda.mapper.ITipoPrendaMapper;
import com.mintic.tienda.service.DTO.TipoPrendaDTO;

public class TipoPrendaMapperImpl implements ITipoPrendaMapper{

    @Override
    public TipoPrenda dTOToEntity(TipoPrendaDTO dto) {
        TipoPrenda tipoPrenda = new TipoPrenda();
        tipoPrenda.setIdTipoPrenda(dto.getIdTipoPrenda());
        tipoPrenda.setTipo(dto.getTipo());
        return tipoPrenda;
    }

    @Override
    public TipoPrendaDTO entityToDTO(TipoPrenda entity) {
        TipoPrendaDTO tipoPrendaDTO = new TipoPrendaDTO();
        tipoPrendaDTO.setIdTipoPrenda(entity.getIdTipoPrenda());
        tipoPrendaDTO.setTipo(entity.getTipo());
        return tipoPrendaDTO;
    }
    
}
