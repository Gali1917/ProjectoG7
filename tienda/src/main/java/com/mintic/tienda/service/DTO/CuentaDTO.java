package com.mintic.tienda.service.DTO;

public class CuentaDTO {
    

    private Long idCuenta;
    private String user;
    private String pass;
    private Long idRol;

    public Long getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Long idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Long getIdRol() {
        return idRol;
    }
    
    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }
    
    @Override
    public String toString() {
        return "CuentaDTO [idCuenta=" + idCuenta + ", idRol=" + idRol + ", pass=" + pass + ", user=" + user + "]";
    }
}
