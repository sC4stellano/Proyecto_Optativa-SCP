package com.example.Proyecto_Optativa.Controller;

import org.springframework.http.ResponseEntity;

import com.example.Proyecto_Optativa.Persistence.Model.Technology;
import com.example.Proyecto_Optativa.Service.TechnologyService;

public class TechnologyController {
    private TechnologyService technologyService;

    public TechnologyController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }

    // POST /api/v1/technologies
    public ResponseEntity<String> createTechnology(Technology technology) {
        technologyService.addTechnology(technology);
        return ResponseEntity.status(201).body("Technology añadida correctamente");
    }

    // DELETE /api/v1/technologies/{id}
    public ResponseEntity<String> deleteTechnology(Integer id) {
        boolean borrado = technologyService.deleteTechnology(id);
        if (borrado) {
            return ResponseEntity.status(204).body(null);
        } else {
            return ResponseEntity.status(404).body("Technology no encontrada");
        }
    }
}
