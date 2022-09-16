package com.mintic.tienda.service.DTO;

public class CuentaDTO {
    

    private int idCuenta;
    private String user;
    private String pass;
    private String idRol;

    public int getIdCuenta() {
        return idCuenta;
    }
    public void setIdCuenta(int idCuenta) {
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
    public String getIdRol() {
        return idRol;
    }
    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }
    
    @Override
    public String toString() {
        return "CuentaDTO [idCuenta=" + idCuenta + ", idRol=" + idRol + ", pass=" + pass + ", user=" + user + "]";
    }
}
