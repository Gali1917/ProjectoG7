package com.mintic.tienda.service.DTO;


public class FacturaPrendaDTO {
    
    private Long idFacturaPrenda;
    private Long idPrenda;
    private Integer cantidad;

    public Long getIdFacturaPrenda() {
        return idFacturaPrenda;
    }

    public void setIdFacturaPrenda(Long idFacturaPrenda) {
        this.idFacturaPrenda = idFacturaPrenda;
    }

    public Long getIdPrenda() {
        return idPrenda;
    }

    public void setIdPrenda(Long idPrenda) {
        this.idPrenda = idPrenda;
    }

    public Integer getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "FacturaPrendaDTO [cantidad=" + cantidad + ", idFacturaPrenda=" + idFacturaPrenda + ", idPrenda="
                + idPrenda + "]";
    }
}
