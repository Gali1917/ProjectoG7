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
    @Column(name = "id")
    private Long id;
    
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "talla")
    private String talla;

    @Column(name = "tipo_prenda")
    private String tipoPrenda;

    @Column(name = "genero")
    private String genero;

    @Column(name = "precio")
    private Long precio;

    @Column(name = "marca")
    private String marca;

    @Column(name = "detalle")
    private String detalle;

    @Column(name = "cantidad_total")
    private Integer cantidad;

    @Column(name = "imagen")
    private String imagen;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

}
