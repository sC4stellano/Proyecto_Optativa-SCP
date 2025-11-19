package com.example.Proyecto_Optativa.Controller;

import java.util.List;

import com.example.Proyecto_Optativa.Persistence.Model.Developer;
import com.example.Proyecto_Optativa.Persistence.Model.Proyecto;
import com.example.Proyecto_Optativa.Persistence.Model.Technology;
import com.example.Proyecto_Optativa.Service.DeveloperService;
import com.example.Proyecto_Optativa.Service.ProyectoService;
import com.example.Proyecto_Optativa.Service.TechnologyService;

public class ProyectoOptativaController {
    private ProyectoService proyectoService;
    private DeveloperService developerService;
    private TechnologyService technologyService;

    // Constructor
    public ProyectoOptativaController(
            ProyectoService proyectoService,
            DeveloperService developerService,
            TechnologyService technologyService) {
        this.proyectoService = proyectoService;
        this.developerService = developerService;
        this.technologyService = technologyService;
    }

    // ----- Endpoints de Proyectos -----
    // GET /api/v1/projects
    public List<Proyecto> getAllProjects() {
        return proyectoService.getAllProyectos();
    }

    // GET /api/v1/projects/{word}
    public List<Proyecto> getProjectsByWord(String word) {
        return proyectoService.searchProyectosByNombre(word);
    }

    // POST /api/v1/projects
    public void createProject(Proyecto proyecto) {
        proyectoService.addProyecto(proyecto);
    }

    // PUT /api/v1/projects/{id}
    public void updateProject(int id, Proyecto proyecto) {
        proyecto.setId(id);
        proyectoService.updateProyecto(proyecto);
    }

    // DELETE /api/v1/projects/{id}
    public void deleteProject(int id) {
        proyectoService.deleteProyecto(id);
    }

    // ----- Endpoints de Developers -----
    // POST /api/v1/developers
    public void createDeveloper(Developer developer) {
        developerService.addDeveloper(developer);
    }

    // DELETE /api/v1/developers/{id}
    public void deleteDeveloper(int id) {
        developerService.deleteDeveloper(id);
    }

    // ----- Endpoints de Technologies -----
    // POST /api/v1/technologies
    public void createTechnology(Technology technology) {
        technologyService.addTechnology(technology);
    }

    // DELETE /api/v1/technologies/{id}
    public void deleteTechnology(int id) {
        technologyService.deleteTechnology(id);
    }
}
