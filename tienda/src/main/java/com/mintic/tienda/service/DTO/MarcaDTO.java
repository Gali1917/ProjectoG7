package com.mintic.tienda.service.DTO;


public class MarcaDTO {
    
    private Long idMarca;
    private String descripcion;
    
    public Long getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Long idMarca) {
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
