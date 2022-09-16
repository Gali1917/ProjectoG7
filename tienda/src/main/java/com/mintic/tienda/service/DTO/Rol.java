package com.mintic.tienda.service.DTO;


public class Rol {
    
    private int idRol;
    private String tipoRol;

    public int getIdRol() {
        return idRol;
    }
    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }
    public String getTipoRol() {
        return tipoRol;
    }
    public void setTipoRol(String tipoRol) {
        this.tipoRol = tipoRol;
    }
    
    @Override
    public String toString() {
        return "Rol [idRol=" + idRol + ", tipoRol=" + tipoRol + "]";
    }
}
