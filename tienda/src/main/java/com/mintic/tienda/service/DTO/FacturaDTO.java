package com.mintic.tienda.service.DTO;

import java.time.ZonedDateTime;

public class FacturaDTO {
    
    private Long idFactura;
    private ZonedDateTime fecha;
    private Long idCliente;
    private Long idFacturaPrenda;
    

    public Long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Long idFactura) {
        this.idFactura = idFactura;
    }

    public ZonedDateTime getFecha() {
        return fecha;
    }

    public void setFecha(ZonedDateTime fecha) {
        this.fecha = fecha;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdFacturaPrenda() {
        return idFacturaPrenda;
    }

    public void setIdFacturaPrenda(Long idFacturaPrenda) {
        this.idFacturaPrenda = idFacturaPrenda;
    }


    @Override
    public String toString() {
        return "FacturaDTO [fecha=" + fecha + ", idCliente=" + idCliente + ", idFactura=" + idFactura
                + ", idFacturaPrenda=" + idFacturaPrenda + "]";
    }
}
