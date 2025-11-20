package com.example.Proyecto_Optativa.Controller;

import org.springframework.http.ResponseEntity;

import com.example.Proyecto_Optativa.Persistence.Model.Proyecto;
import com.example.Proyecto_Optativa.Service.ProyectoService;
import java.util.List;

public class ProyectoController {

    private ProyectoService proyectoService;

    public ProyectoController(ProyectoService proyectoService) {
        this.proyectoService = proyectoService;
    }

    // GET /api/v1/projects
    public ResponseEntity<List<Proyecto>> getAllProjects() {
        return ResponseEntity.ok(proyectoService.getAllProyectos());
    }

    // GET /api/v1/projects/{word}
    public ResponseEntity<List<Proyecto>> getProjectsByWord(String word) {
        List<Proyecto> result = proyectoService.searchProyectosByNombre(word);
        if (result.isEmpty()) {
            return ResponseEntity.status(404).body(result);
        }
        return ResponseEntity.ok(result);
    }

    // POST /api/v1/projects
    public ResponseEntity<String> createProject(Proyecto proyecto) {
        proyectoService.addProyecto(proyecto);
        return ResponseEntity.status(201).body("Proyecto creado correctamente");
    }

    // PUT /api/v1/projects/{id}
    public ResponseEntity<String> updateProject(Integer id, Proyecto proyecto) {
        proyecto.setProject_id(id);
        boolean ok = proyectoService.updateProyecto(proyecto);
        if (ok) {
            return ResponseEntity.ok("Proyecto actualizado correctamente");
        } else {
            return ResponseEntity.status(404).body("Proyecto no encontrado");
        }
    }

    // DELETE /api/v1/projects/{id}
    public ResponseEntity<String> deleteProject(Integer id) {
        boolean borrado = proyectoService.deleteProyecto(id);
        if (borrado) {
            return ResponseEntity.status(204).body(null);
        } else {
            return ResponseEntity.status(404).body("Proyecto no encontrado");
        }
    }
}
