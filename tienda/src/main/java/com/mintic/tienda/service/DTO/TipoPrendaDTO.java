package com.mintic.tienda.service.DTO;


public class TipoPrendaDTO {
    
    private Long idTipoPrenda;
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
    
    @Override
    public String toString() {
        return "TipoPrendaDTO [idTipoPrenda=" + idTipoPrenda + ", tipo=" + tipo + "]";
    }
}
