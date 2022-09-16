package com.mintic.tienda.service.DTO;


public class MarcaDTO {
    
    private int idMarca;
    private String descripcion;
    
    public int getIdMarca() {
        return idMarca;
    }
    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "MarcaDTO [descripcion=" + descripcion + ", idMarca=" + idMarca + "]";
    }
}
