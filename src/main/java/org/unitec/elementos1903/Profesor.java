/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1903;

import org.springframework.data.annotation.Id;

/**
 *
 * @author Servicios Especiales
 */
public class Profesor {
    
    @Id
    private Integer clave;
    private String nombre;
    private String email;

    public Profesor(Integer clave, String nombre, String email) {
        this.clave = clave;
        this.nombre = nombre;
        this.email = email;
    }

    public Profesor() {
    }

    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
