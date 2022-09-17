package com.mintic.tienda.service.DTO;

public class ClienteDTO {
    
    private Long idCliente;
    private String nombre;
    
    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ClienteDTO [idCliente=" + idCliente + ", nombre=" + nombre + "]";
    }
}
