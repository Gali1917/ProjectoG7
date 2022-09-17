package com.mintic.tienda.entity;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "factura")
public class Factura {
    
    @Id
    @GeneratedValue( strategy=GenerationType.AUTO )
    @Column(name = "id_factura")
    private Long idFactura;
    
    @Column(name = "fecha")
    private ZonedDateTime fecha;

    @Column(name = "id_cliente")
    private Long idCliente;

    @Column(name = "id_factura_prenda")
    private Long idFacturaPrenda;


    public Long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Long idFactura) {
        this.idFactura = idFactura;
    }

    public ZonedDateTime getFecha() {
        return fecha;
    }

    public void setFecha(ZonedDateTime fecha) {
        this.fecha = fecha;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdFacturaPrenda() {
        return idFacturaPrenda;
    }

    public void setIdFacturaPrenda(Long idFacturaPrenda) {
        this.idFacturaPrenda = idFacturaPrenda;
    }
}
