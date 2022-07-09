/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBackend.PortfolioBackend.Service;

import com.PortfolioBackend.PortfolioBackend.Model.Educacion;
import com.PortfolioBackend.PortfolioBackend.Repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nahue
 */
@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    private EducacionRepository edu;

    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> listExperience = this.edu.findAll();
        return listExperience;    
    }
    @Override
    public void saveEducacion(Educacion sk) {
        this.edu.save(sk);
    }

    @Override
    public void deleteEducacion(Long id) {
        this.edu.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
        Educacion sk = this.edu.findById(id).orElse(null);
        return sk;
    }
    
    @Override
    public Long getEducacionByAttr(String titulo, String descrip) {
        Educacion sk = this.edu.findByAttr(titulo, descrip);
        return sk.getId();
    }
}