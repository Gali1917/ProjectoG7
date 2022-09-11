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
    private int idPrenda;
    
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "id_talla")
    private String idTalla;

    @Column(name = "id_tipo_prenda")
    private String idTipoPrenda;

    @Column(name = "id_genero")
    private String idGenero;

    @Column(name = "precio")
    private String precio;

    @Column(name = "id_marca")
    private String idMarca;

    @Column(name = "detalle")
    private String detalle;

    @Column(name = "cantidad_total")
    private String Cantidad;

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
        return Cantidad;
    }

    public void setCantidad(String cantidad) {
        Cantidad = cantidad;
    }
}
