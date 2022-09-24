package com.mintic.tienda.service.DTO;


public class PrendaDTO {

    private Long idPrenda;
    private String nombre;
    private String talla;
    private String tipoPrenda;
    private String genero;
    private Long precio;
    private String marca;
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

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(String tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
        return "PrendaDTO [cantidad=" + cantidad + ", detalle=" + detalle + ", Genero=" + genero + ", Marca="
                + marca + ", idPrenda=" + idPrenda + ", Talla=" + talla + ", TipoPrenda=" + tipoPrenda
                + ", imagen=" + imagen + ", nombre=" + nombre + ", precio=" + precio + "]";
    }
}
