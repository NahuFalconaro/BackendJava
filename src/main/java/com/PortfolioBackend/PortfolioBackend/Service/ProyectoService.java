/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioBackend.PortfolioBackend.Service;

import com.PortfolioBackend.PortfolioBackend.Model.Proyecto;
import com.PortfolioBackend.PortfolioBackend.Repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nahue
 */
@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired
    private ProyectoRepository proyectoRepository;
    
    @Override
    public List<Proyecto> getProyecto() {
        List<Proyecto> listProyecto = this.proyectoRepository.findAll();
        return listProyecto;
    }
    @Override
    public void saveProyecto(Proyecto sk) {
        this.proyectoRepository.save(sk);
    }

    @Override
    public void deleteProyecto(Long id) {
        this.proyectoRepository.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Long id) {
        Proyecto sk = this.proyectoRepository.findById(id).orElse(null);
        return sk;
    }

    @Override
    public Long getProjectByAttr(String nombre, String descrip) {
        Proyecto sk = this.proyectoRepository.findByAttr(nombre, descrip);
        return sk.getId();
    }

}