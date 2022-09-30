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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((talla == null) ? 0 : talla.hashCode());
        result = prime * result + ((tipoPrenda == null) ? 0 : tipoPrenda.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((precio == null) ? 0 : precio.hashCode());
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((detalle == null) ? 0 : detalle.hashCode());
        result = prime * result + ((cantidad == null) ? 0 : cantidad.hashCode());
        result = prime * result + ((imagen == null) ? 0 : imagen.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Prenda other = (Prenda) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (talla == null) {
            if (other.talla != null)
                return false;
        } else if (!talla.equals(other.talla))
            return false;
        if (tipoPrenda == null) {
            if (other.tipoPrenda != null)
                return false;
        } else if (!tipoPrenda.equals(other.tipoPrenda))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (precio == null) {
            if (other.precio != null)
                return false;
        } else if (!precio.equals(other.precio))
            return false;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (detalle == null) {
            if (other.detalle != null)
                return false;
        } else if (!detalle.equals(other.detalle))
            return false;
        if (cantidad == null) {
            if (other.cantidad != null)
                return false;
        } else if (!cantidad.equals(other.cantidad))
            return false;
        if (imagen == null) {
            if (other.imagen != null)
                return false;
        } else if (!imagen.equals(other.imagen))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Prenda [id=" + id + ", nombre=" + nombre + ", talla=" + talla + ", tipoPrenda=" + tipoPrenda
                + ", genero=" + genero + ", precio=" + precio + ", marca=" + marca + ", detalle=" + detalle
                + ", cantidad=" + cantidad + ", imagen=" + imagen + "]";
    }
}
