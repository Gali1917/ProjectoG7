package com.mintic.tienda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "prenda")
public class Prenda {
    
    @Id
    @GeneratedValue( strategy=GenerationType.AUTO )
    @Column(name = "id_prenda")
    private Long idPrenda;
    
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "id_talla")
    private Long idTalla;

    @Column(name = "id_tipo_prenda")
    private Long idTipoPrenda;

    @Column(name = "id_genero")
    private Long idGenero;

    @Column(name = "precio")
    private Long precio;

    @Column(name = "id_marca")
    private Long idMarca;

    @Column(name = "detalle")
    private String detalle;

    @Column(name = "cantidad_total")
    private Integer cantidad;

    @Column(name = "imagen")
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

}
