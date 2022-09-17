package com.mintic.tienda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "factura_prenda")
public class FacturaPrenda {
    
    @Id
    @GeneratedValue( strategy=GenerationType.AUTO )
    @Column(name = "id_factura_prenda")
    private Long idFacturaPrenda;
    
    @Column(name = "id_prenda")
    private Long idPrenda;

    @Column(name = "cantidad_vendida")
    private Integer cantidad;

    public Long getIdFacturaPrenda() {
        return idFacturaPrenda;
    }

    public void setIdFacturaPrenda(Long idFacturaPrenda) {
        this.idFacturaPrenda = idFacturaPrenda;
    }

    public Long getIdPrenda() {
        return idPrenda;
    }

    public void setIdPrenda(Long idPrenda) {
        this.idPrenda = idPrenda;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    
}
