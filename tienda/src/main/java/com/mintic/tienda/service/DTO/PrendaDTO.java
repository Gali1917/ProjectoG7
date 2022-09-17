package com.mintic.tienda.service.DTO;


public class PrendaDTO {

    private Long idPrenda;
    private String nombre;
    private Long idTalla;
    private Long idTipoPrenda;
    private Long idGenero;
    private Long precio;
    private Long idMarca;
    private String detalle;
    private Integer cantidad;
    private String imagen;


    public Long getIdPrenda() {
        return idPrenda;
    }

    public void setIdPrenda(Long idPrenda) {
        this.idPrenda = idPrenda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(Long idTalla) {
        this.idTalla = idTalla;
    }

    public Long getIdTipoPrenda() {
        return idTipoPrenda;
    }

    public void setIdTipoPrenda(Long idTipoPrenda) {
        this.idTipoPrenda = idTipoPrenda;
    }

    public Long getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Long idGenero) {
        this.idGenero = idGenero;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public Long getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Long idMarca) {
        this.idMarca = idMarca;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getImagen() {
        return imagen;
    }
    
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "PrendaDTO [cantidad=" + cantidad + ", detalle=" + detalle + ", idGenero=" + idGenero + ", idMarca="
                + idMarca + ", idPrenda=" + idPrenda + ", idTalla=" + idTalla + ", idTipoPrenda=" + idTipoPrenda
                + ", imagen=" + imagen + ", nombre=" + nombre + ", precio=" + precio + "]";
    }
}
