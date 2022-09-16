package com.mintic.tienda.service.DTO;

public class ClienteDTO {
    
    private int idCliente;
    private String nombre;
    
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
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
