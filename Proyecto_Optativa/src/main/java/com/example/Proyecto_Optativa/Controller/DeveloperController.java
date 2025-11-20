package com.example.Proyecto_Optativa.Controller;

import org.springframework.http.ResponseEntity;

import com.example.Proyecto_Optativa.Persistence.Model.Developer;
import com.example.Proyecto_Optativa.Service.DeveloperService;

public class DeveloperController {
    private DeveloperService developerService;

    public DeveloperController(DeveloperService developerService) {
        this.developerService = developerService;
    }

    // POST /api/v1/developers
    public ResponseEntity<String> createDeveloper(Developer developer) {
        developerService.addDeveloper(developer);
        return ResponseEntity.status(201).body("Developer añadido correctamente");
    }

    // DELETE /api/v1/developers/{id}
    public ResponseEntity<String> deleteDeveloper(Integer id) {
        boolean borrado = developerService.deleteDeveloper(id);
        if (borrado) {
            return ResponseEntity.status(204).body(null);
        } else {
            return ResponseEntity.status(404).body("Developer no encontrado");
        }
    }
}
