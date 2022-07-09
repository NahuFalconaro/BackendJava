/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBackend.PortfolioBackend.Service;

import com.PortfolioBackend.PortfolioBackend.Model.Persona;
import com.PortfolioBackend.PortfolioBackend.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nahue
 */
@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    private PersonaRepository persoRepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> listPeople = this.persoRepository.findAll();
        return listPeople;
    }
    @Override
    public void savePersona(Persona perso) {
        this.persoRepository.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
        this.persoRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona p = this.persoRepository.findById(id).orElse(null);
        return p;
    }

}
