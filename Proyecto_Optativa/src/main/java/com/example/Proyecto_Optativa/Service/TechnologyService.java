package com.example.Proyecto_Optativa.Service;

import com.example.Proyecto_Optativa.Persistence.Model.Technology;
import com.example.Proyecto_Optativa.Persistence.Repository.TechnologyRepository;

public class TechnologyService {

    private TechnologyRepository technologyRepository;

    public TechnologyService(TechnologyRepository technologyRepository) {
        this.technologyRepository = technologyRepository;
    }

    public boolean addTechnology(Technology technology) {
        technologyRepository.save(technology);
        return true;
    }

    public boolean deleteTechnology(Integer id) {
        return technologyRepository.delete(id);
    }

}
