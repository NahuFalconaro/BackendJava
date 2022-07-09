/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PortfolioBackend.PortfolioBackend.Service;

import com.PortfolioBackend.PortfolioBackend.Model.Proyecto;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nahue
 */
@Service
public interface IProyectoService {
    public List<Proyecto> getProyecto();
    public Proyecto findProyecto(Long id);
    public void saveProyecto(Proyecto sk);
    public void deleteProyecto(Long id);
    public Long getProjectByAttr(String nombre, String descrip);
}
