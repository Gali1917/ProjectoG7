package com.mintic.tienda.service.DTO;


public class PrendaDTO {

    private int idPrenda;
    private String nombre;
    private String idTalla;
    private String idTipoPrenda;
    private String idGenero;
    private String precio;
    private String idMarca;
    private String detalle;
    private String cantidad;

    public int getIdPrenda() {
        return idPrenda;
    }
    public void setIdPrenda(int idPrenda) {
        this.idPrenda = idPrenda;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIdTalla() {
        return idTalla;
    }
    public void setIdTalla(String idTalla) {
        this.idTalla = idTalla;
    }
    public String getIdTipoPrenda() {
        return idTipoPrenda;
    }
    public void setIdTipoPrenda(String idTipoPrenda) {
        this.idTipoPrenda = idTipoPrenda;
    }
    public String getIdGenero() {
        return idGenero;
    }
    public void setIdGenero(String idGenero) {
        this.idGenero = idGenero;
    }
    public String getPrecio() {
        return precio;
    }
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    public String getIdMarca() {
        return idMarca;
    }
    public void setIdMarca(String idMarca) {
        this.idMarca = idMarca;
    }
    public String getDetalle() {
        return detalle;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    public String getCantidad() {
        return cantidad;
    }
    public void setCantidad(String cantidad) {
        cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        return "PrendaDTO [cantidad=" + cantidad + ", detalle=" + detalle + ", idGenero=" + idGenero + ", idMarca="
                + idMarca + ", idPrenda=" + idPrenda + ", idTalla=" + idTalla + ", idTipoPrenda=" + idTipoPrenda
                + ", nombre=" + nombre + ", precio=" + precio + "]";
    }
}
