package com.example.Proyecto_Optativa.Persistence.Repository;

import com.example.Proyecto_Optativa.Persistence.Model.Developer;

public interface DeveloperRepository {
    void save(Developer developer);

    boolean delete(Integer id);
}