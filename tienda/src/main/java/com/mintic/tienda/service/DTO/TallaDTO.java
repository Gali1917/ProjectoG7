package com.mintic.tienda.service.DTO;


public class TallaDTO {
    
    private Long idTalla;
    private String talla;

    public Long getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(Long idTalla) {
        this.idTalla = idTalla;
    }

    public String getTalla() {
        return talla;
    }
    
    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "TallaDTO [idTalla=" + idTalla + ", talla=" + talla + "]";
    }
}
    
