package com.example.Proyecto_Optativa.Persistence.Repository;

import java.util.ArrayList;
import java.util.List;
import com.example.Proyecto_Optativa.Persistence.Model.Proyecto;

public class ProyectoRepositoryImpl implements ProyectoRepository {
    private List<Proyecto> listaProyectos = new ArrayList<>();

    @Override
    public List<Proyecto> findAll() {
        return new ArrayList<>(listaProyectos); // Devuelve una copia para evitar modificar la lista original desde
                                                // fuera
    }

    @Override
    public Proyecto findById(Integer id) {
        for (Proyecto proyecto : listaProyectos) {
            if (proyecto.getProject_id().equals(id)) {
                return proyecto;
            }
        }
        return null;
    }

    @Override
    public List<Proyecto> findByNombreContains(String palabra) {
        List<Proyecto> resultado = new ArrayList<>();
        for (Proyecto proyecto : listaProyectos) {
            if (proyecto.getProject_name() != null &&
                    proyecto.getProject_name().toLowerCase().contains(palabra.toLowerCase())) {
                resultado.add(proyecto);
            }
        }
        return resultado;
    }

    @Override
    public void save(Proyecto proyecto) {
        listaProyectos.add(proyecto);
    }

    @Override
    public boolean update(Proyecto proyecto) {
        for (int i = 0; i < listaProyectos.size(); i++) {
            if (listaProyectos.get(i).getProject_id().equals(proyecto.getProject_id())) {
                listaProyectos.set(i, proyecto);
                return true; // Actualizado correctamente
            }
        }
        return false; // No se encontró el proyecto con ese id
    }

    @Override
    public boolean delete(Integer id) {
        for (Proyecto proyecto : listaProyectos) {
            if (proyecto.getProject_id().equals(id)) {
                listaProyectos.remove(proyecto);
                return true; // Borrado correctamente
            }
        }
        return false; // No se encontró el proyecto con ese id
    }
}
