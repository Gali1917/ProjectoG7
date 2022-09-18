package com.mintic.tienda.mapper.impl;

import org.springframework.stereotype.Component;
import com.mintic.tienda.entity.FacturaPrenda;
import com.mintic.tienda.mapper.IFacturaPrendaMapper;
import com.mintic.tienda.service.DTO.FacturaPrendaDTO;

@Component
public class FacturaPrendaMapperImpl implements IFacturaPrendaMapper{

    @Override
    public FacturaPrenda dTOToEntity(FacturaPrendaDTO dto) {
        FacturaPrenda facturaPrenda = new FacturaPrenda();
        facturaPrenda.setIdFacturaPrenda(dto.getIdFacturaPrenda());
        facturaPrenda.setCantidad(dto.getCantidad());
        return facturaPrenda;
    }

    @Override
    public FacturaPrendaDTO entityToDTO(FacturaPrenda entity) {
        FacturaPrendaDTO facturaPrendaDTO = new FacturaPrendaDTO();
        facturaPrendaDTO.setIdFacturaPrenda(entity.getIdFacturaPrenda());
        facturaPrendaDTO.setCantidad(entity.getCantidad());
        return facturaPrendaDTO;
    }
    
}
