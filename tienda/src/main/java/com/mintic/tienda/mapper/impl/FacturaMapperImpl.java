package com.mintic.tienda.mapper.impl;

import com.mintic.tienda.entity.Factura;
import com.mintic.tienda.mapper.IFacturaMapper;
import com.mintic.tienda.service.DTO.FacturaDTO;

public class FacturaMapperImpl implements IFacturaMapper {

    @Override
    public Factura dTOToEntity(FacturaDTO dto) {
        Factura factura = new Factura();
        factura.setIdFactura(dto.getIdFactura());
        factura.setFecha(dto.getFecha());
        factura.setIdCliente(dto.getIdCliente());
        factura.setIdFactura(dto.getIdFacturaPrenda());
        return factura;
    }

    @Override
    public FacturaDTO entityToDTO(Factura entity) {
        FacturaDTO facturaDTO = new FacturaDTO();
        facturaDTO.setIdFactura(entity.getIdFactura());
        facturaDTO.setFecha(entity.getFecha());
        facturaDTO.setIdCliente(entity.getIdCliente());
        facturaDTO.setIdFactura(entity.getIdFacturaPrenda());
        return facturaDTO;
    }
    
}
