package com.example.Proyecto_Optativa.Service;

import java.util.List;
import com.example.Proyecto_Optativa.Persistence.Model.Proyecto;
import com.example.Proyecto_Optativa.Persistence.Repository.ProyectoRepository;

public class ProyectoService {
    private ProyectoRepository proyectoRepository;

    public ProyectoService(ProyectoRepository proyectoRepository) {
        this.proyectoRepository = proyectoRepository;
    }

    public List<Proyecto> getAllProyectos() {
        return proyectoRepository.findAll();
    }

    public Proyecto getProyectoById(Integer id) {
        return proyectoRepository.findById(id);
    }

    public List<Proyecto> searchProyectosByNombre(String palabra) {
        return proyectoRepository.findByNombreContains(palabra);
    }

    public void addProyecto(Proyecto proyecto) {
        proyectoRepository.save(proyecto);
    }

    public boolean updateProyecto(Proyecto proyecto) {
        return proyectoRepository.update(proyecto);
    }

    public boolean deleteProyecto(Integer id) {
        return proyectoRepository.delete(id);
    }

}
