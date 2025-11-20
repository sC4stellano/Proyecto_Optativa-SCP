package com.example.Proyecto_Optativa.Persistence.Repository;

import com.example.Proyecto_Optativa.Persistence.Model.Technology;

public interface TechnologyRepository {
    void save(Technology technology);

    void delete(Integer id);

}