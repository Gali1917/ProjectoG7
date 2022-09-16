package com.mintic.tienda.service.DTO;


public class FacturaPrendaDTO {
    
    private int idFacturaPrenda;
    private String idPrenda;
    private String cantidad;
    
    public int getIdFacturaPrenda() {
        return idFacturaPrenda;
    }
    public void setIdFacturaPrenda(int idFacturaPrenda) {
        this.idFacturaPrenda = idFacturaPrenda;
    }
    public String getIdPrenda() {
        return idPrenda;
    }
    public void setIdPrenda(String idPrenda) {
        this.idPrenda = idPrenda;
    }
    public String getCantidad() {
        return cantidad;
    }
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "FacturaPrendaDTO [cantidad=" + cantidad + ", idFacturaPrenda=" + idFacturaPrenda + ", idPrenda="
                + idPrenda + "]";
    }
}
