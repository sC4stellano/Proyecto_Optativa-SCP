package com.example.Proyecto_Optativa.Persistence.Repository;

import java.util.List;
import com.example.Proyecto_Optativa.Persistence.Model.Proyecto;

public interface ProyectoRepository {
    List<Proyecto> findAll();

    Proyecto findById(int id);

    List<Proyecto> findByNombreContains(String palabra);

    void save(Proyecto proyecto);

    void update(Proyecto proyecto);

    void delete(int id);
}
