/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PortfolioBackend.PortfolioBackend.Service;

import com.PortfolioBackend.PortfolioBackend.Model.Persona;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nahue
 */
@Service
public interface IPersonaService {
     public List<Persona> getPersona();
     public Persona findPersona(Long id);
     public void savePersona(Persona perso);
     public void deletePersona(Long id);
}
