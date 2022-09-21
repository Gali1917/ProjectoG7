package com.proyecto.tienda.Entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Factura_prenda")
public class FacturaPrenda implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_factura_prenda;

    @Column(name = "id_prenda")
    private long id_prenda;

    @Column(name = "cantidad_vendida")
    private int cantidad_vendida;

    public FacturaPrenda(){

    }
    public FacturaPrenda(long id_prenda, int cantidad_vendida){
        this.id_prenda = id_prenda;
        this.cantidad_vendida = cantidad_vendida;
    }

    @ManyToMany(mappedBy = "facturaprenda", fetch = FetchType.LAZY)
    private Set<Prenda> prenda = new HashSet<>();

    public long getId() {
        return id_factura_prenda;
    }

    public void setId(long id_factura_prenda) {
        this.id_factura_prenda = id_factura_prenda;
    }

    public int getCantidad_vendida() {
        return cantidad_vendida;
    }

    public void setCantidad_vendida(int cantidad_vendida) {
        this.cantidad_vendida = cantidad_vendida;
    }

    public Set<Prenda> getPrenda() {
        return prenda;
    }

    public void setPrenda(Set<Prenda> prenda) {
        this.prenda = prenda;
    }

    @Override
    public String toString(){
        return "FacturaPrenda{" + "id_prenda" + id_prenda + ", cantidad_vendida" + cantidad_vendida + "}";
    }
}
