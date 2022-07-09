/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PortfolioBackend.PortfolioBackend.Service;

/**
 *
 * @author Nahue
 */

import com.PortfolioBackend.PortfolioBackend.Model.Experiencia;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IExperienciaService {
    public List<Experiencia> getExperiencias();
            public Experiencia findExperiencia(Long id);
        public void saveExperiencia(Experiencia sk);
        public void deleteExperiencia(Long id);
        public Long getExperienciaByAttr(String titulo, String descripcion);
}
