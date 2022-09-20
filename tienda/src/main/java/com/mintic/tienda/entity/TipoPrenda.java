package com.mintic.tienda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tipo_prenda")
public class TipoPrenda {
    
    @Id
    @GeneratedValue( strategy=GenerationType.AUTO )
    @Column(name = "id_tipo_prenda")
    private Long idTipoPrenda;
    
    @Column(name = "tipo")
    private String tipo;

    public Long getIdTipoPrenda() {
        return idTipoPrenda;
    }

    public void setIdTipoPrenda(Long idTipoPrenda) {
        this.idTipoPrenda = idTipoPrenda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
