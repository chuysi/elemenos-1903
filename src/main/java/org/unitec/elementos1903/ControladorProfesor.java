/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1903;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Servicios Especiales
 */
@RestController
@RequestMapping("/api")
public class ControladorProfesor {
    
    //Metodo para Guardar 
    @Autowired
    RepoProfesor repoProfe;
     
    @PostMapping("/profesor")
    public Estatus guardar(@RequestBody String json)throws Exception{
        //rimero vamos a recibir el json del cliente y lo transformamos a un
        //objeto con la clase OjectMaer
        ObjectMapper maper=new ObjectMapper();
        //AHora si lo leemos 
      Profesor profe=  maper.readValue(json,Profesor.class);
      
      repoProfe.save(profe);
      //Generamos el status
      Estatus e=new Estatus();
      e.setMensaje("El profe guardado con exito");
      e.setSuccess(true);
      return e;
      
    
    }
    @GetMapping("/profesor")
    public List<Profesor> buscarTodos(){
        return repoProfe.findAll();
    }
    
            
}

