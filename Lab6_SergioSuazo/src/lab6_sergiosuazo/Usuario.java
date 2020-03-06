/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_sergiosuazo;

import java.util.Date;

/**
 *
 * @author Sergio
 */
public class Usuario {
    private String nombre,user,contra,fecha;

    public Usuario() {
    }

    public Usuario(String nombre, String user, String contra, String fecha) {
        this.nombre = nombre;
        this.user = user;
        this.contra = contra;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
