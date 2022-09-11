package com.mintic.tienda.entity;

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
    private int idFactura;
    
    @Column(name = "fecha")
    private String fecha;

    @Column(name = "id_cliente")
    private String idCliente;

    @Column(name = "id_factura_prenda")
    private String idFacturaPrenda;

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdFacturaPrenda() {
        return idFacturaPrenda;
    }

    public void setIdFacturaPrenda(String idFacturaPrenda) {
        this.idFacturaPrenda = idFacturaPrenda;
    }
}
