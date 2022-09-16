package com.mintic.tienda.service.DTO;


public class TipoPrendaDTO {
    
    private int idTipoPrenda;
    private String tipo;

    public int getIdTipoPrenda() {
        return idTipoPrenda;
    }
    public void setIdTipoPrenda(int idTipoPrenda) {
        this.idTipoPrenda = idTipoPrenda;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return "TipoPrendaDTO [idTipoPrenda=" + idTipoPrenda + ", tipo=" + tipo + "]";
    }
}
