/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBackend.PortfolioBackend.Service;

import com.PortfolioBackend.PortfolioBackend.Model.Experiencia;
import com.PortfolioBackend.PortfolioBackend.Repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nahue
 */
@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    private ExperienciaRepository experien;

    @Override
    public List<Experiencia> getExperiencias() {
        List<Experiencia> listExperience = this.experien.findAll();
        return listExperience;    
    }
        @Override
    public void saveExperiencia(Experiencia sk) {
        this.experien.save(sk);
    }

    @Override
    public void deleteExperiencia(Long id) {
        this.experien.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia sk = this.experien.findById(id).orElse(null);
        return sk;
    }
    
    @Override
    public Long getExperienciaByAttr(String titulo, String descripcion) {
        Experiencia sk = this.experien.findByAttr(titulo, descripcion);
        return sk.getId();
    }
}
