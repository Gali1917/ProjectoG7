package com.mintic.tienda.service.DTO;


public class GeneroDTO {
    
    private Long idGenero;
    private String descripcion;
    
    public Long getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Long idGenero) {
        this.idGenero = idGenero;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "GeneroDTO [descripcion=" + descripcion + ", idGenero=" + idGenero + "]";
    }
}
