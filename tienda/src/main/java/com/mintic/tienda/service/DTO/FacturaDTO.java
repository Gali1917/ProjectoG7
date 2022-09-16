package com.mintic.tienda.service.DTO;



public class FacturaDTO {
    
    private int idFactura;
    private String fecha;
    private String idCliente;
    private String idFacturaPrenda;
    
    public int getIdFactura() {
        return idFactura;
    }
    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
    public String getIdFacturaPrenda() {
        return idFacturaPrenda;
    }
    public void setIdFacturaPrenda(String idFacturaPrenda) {
        this.idFacturaPrenda = idFacturaPrenda;
    }

    @Override
    public String toString() {
        return "FacturaDTO [fecha=" + fecha + ", idCliente=" + idCliente + ", idFactura=" + idFactura
                + ", idFacturaPrenda=" + idFacturaPrenda + "]";
    }
}
