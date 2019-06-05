package org.unitec.elementos1903;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Elementos1903Application implements CommandLineRunner {
    
    @Autowired
    RepoCliente repoCliente;

	public static void main(String[] args) {
		SpringApplication.run(Elementos1903Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        repoCliente.save(new Cliente(1, "El BRayan","Elmongo@hotm"));
      // repoCliente.save(new Cliente(3, "Juanito", "Elmongo@hotm"));
      // repoCliente.save(new Cliente(3, "el mongas", "Elmongo@hotm"));
        repoCliente.save(new Cliente(4, "Juanito", "Elmongo@hotm"));
    
    //buscar todosh
    for (Cliente c: repoCliente.findAll()){
            System.out.println(c);
    }
    //buscar por id 
        System.out.println(repoCliente.findById(2));
        
        //borramos el primero despues lo vuelven a insertar
       // repoCliente.deleteById(1);
}
}
