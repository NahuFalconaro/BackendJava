/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PortfolioBackend.PortfolioBackend.Service;

import com.PortfolioBackend.PortfolioBackend.Model.Educacion;
import java.util.List;

/**
 *
 * @author Nahue
 */
public interface IEducacionService {
     public List<Educacion> getEducacion();
                 public Educacion findEducacion(Long id);
        public void saveEducacion(Educacion sk);
        public void deleteEducacion(Long id);
        public Long getEducacionByAttr(String titulo, String descrip);
}
