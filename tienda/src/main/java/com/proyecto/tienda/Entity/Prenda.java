package com.proyecto.tienda.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "prenda")
public class Prenda {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_prenda;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "id_talla")
    private int id_talla;

    @Column(name = "id_tipo_prenda")
    private int id_tipo_prenda;

    @Column(name = "id_genero")
    private int id_genero;

    @Column(name = "precio")
    private long precio;

    @Column(name = "id_marca")
    private int id_marca;

    @Column(name = "detalle")
    private String detalle;

    @Column(name = "cantidad_total")
    private long cantidad_total;

    @Column(name = "foto")
    private String foto;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "prenda_factura", joinColumns = {
        @JoinColumn(name = "id_p", referencedColumnName = "id_prenda", nullable = false, updatable = false)
    }, inverseJoinColumns = {
        @JoinColumn(name = "id_f", referencedColumnName = "id_factura_prenda", nullable = false, updatable = false)
    })
    private Set<FacturaPrenda> facturaPrenda = new HashSet<>();

    public Prenda(){

    }

    public Prenda( String nombre, int id_talla, int id_tipo_prenda, int id_genero, long precio, int id_marca, String detalle, long cantidad_total, String foto){
        this.nombre = nombre;
        this.id_talla = id_talla;
        this.id_tipo_prenda = id_tipo_prenda;
        this.id_genero = id_genero;
        this.precio = precio;
        this.id_marca = id_marca;
        this.detalle = detalle;
        this.cantidad_total = cantidad_total;
        this.foto = foto;
    }

    public long getId_prenda() {
        return id_prenda;
    }

    public void setId_prenda(long id_prenda) {
        this.id_prenda = id_prenda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_talla() {
        return id_talla;
    }

    public void setId_talla(int id_talla) {
        this.id_talla = id_talla;
    }

    public int getId_tipo_prenda() {
        return id_tipo_prenda;
    }

    public void setId_tipo_prenda(int id_tipo_prenda) {
        this.id_tipo_prenda = id_tipo_prenda;
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public long getCantidad_total() {
        return cantidad_total;
    }

    public void setCantidad_total(long cantidad_total) {
        this.cantidad_total = cantidad_total;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Set<FacturaPrenda> getFacturaPrenda() {
        return facturaPrenda;
    }

    public void setFacturaPrenda(Set<FacturaPrenda> facturaPrenda) {
        this.facturaPrenda = facturaPrenda;
    }

    @Override
    public String toString(){
        return "Prenda{" + "nombre=" + nombre + ", id_talla=" + id_talla + ", id_tipo_prenda=" + id_tipo_prenda + ", id_genero" + id_genero + ", precio" + precio + ", id_marca" + id_marca + ", detalle" + detalle + ", cantidad_total=" + cantidad_total + ", foto=" + foto + "}";
    }
}
