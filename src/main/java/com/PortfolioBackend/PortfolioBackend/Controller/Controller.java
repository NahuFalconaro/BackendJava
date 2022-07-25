/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBackend.PortfolioBackend.Controller;

import com.PortfolioBackend.PortfolioBackend.Model.Persona;
import com.PortfolioBackend.PortfolioBackend.Service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nahue
 */
@RestController
@CrossOrigin(origins = {"http://localhost:4200", "https://porfolio-argprograma.web.app"})
public class Controller {
    
    @Autowired
    private IPersonaService interPersona;
    
    @GetMapping("/hi")
    public String decirHola(){
        return "Hello world";
    }
    
    @GetMapping("/persona")
    public List<Persona> getPersonas(){
        return interPersona.getPersona();
    }

    @GetMapping("/persona/{id}")
    public Persona getPersonas(@PathVariable Long id){
        return this.interPersona.findPersona(id);
    }
    
    @PutMapping("/persona/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                                @RequestBody Persona per){
        Persona p = this.interPersona.findPersona(id);
        p.setApellido(per.getApellido());
        p.setNombre(per.getNombre());
        p.setDescripcion(per.getDescripcion());
        p.setOcupacion(per.getOcupacion());
        p.setMail(per.getMail());
        this.interPersona.savePersona(p);
        return p;

    }
}
