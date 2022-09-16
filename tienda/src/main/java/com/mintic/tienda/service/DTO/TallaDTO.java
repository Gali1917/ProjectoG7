package com.mintic.tienda.service.DTO;


public class TallaDTO {
    
    private int idTalla;
    private String talla;

    public int getIdTalla() {
        return idTalla;
    }
    public void setIdTalla(int idTalla) {
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
    
