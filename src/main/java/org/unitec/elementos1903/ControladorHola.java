package org.unitec.elementos1903;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Servicios Especiales
 */
@RestController
@RequestMapping("/api")

public class ControladorHola {
    @GetMapping("/hola")
    public String hola(){
    return"Mi primer servicio REST con spring ;)";
}
}
