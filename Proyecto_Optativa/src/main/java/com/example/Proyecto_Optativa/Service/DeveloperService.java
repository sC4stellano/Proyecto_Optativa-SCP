package com.example.Proyecto_Optativa.Service;

import com.example.Proyecto_Optativa.Persistence.Model.Developer;
import com.example.Proyecto_Optativa.Persistence.Repository.DeveloperRepository;

public class DeveloperService {
    private DeveloperRepository developerRepository;

    public DeveloperService(DeveloperRepository developerRepository) {
        this.developerRepository = developerRepository;
    }

    public boolean addDeveloper(Developer developer) {
        developerRepository.save(developer);
        return true;
    }

    public boolean deleteDeveloper(Integer id) {
        return developerRepository.delete(id);
    }
}
