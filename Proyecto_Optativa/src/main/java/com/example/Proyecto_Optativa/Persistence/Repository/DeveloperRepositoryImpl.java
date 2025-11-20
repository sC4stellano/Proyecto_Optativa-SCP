package com.example.Proyecto_Optativa.Persistence.Repository;

import java.util.ArrayList;
import java.util.List;
import com.example.Proyecto_Optativa.Persistence.Model.Developer;

public class DeveloperRepositoryImpl implements DeveloperRepository {
    private List<Developer> listaDevelopers = new ArrayList<>();

    @Override
    public void save(Developer developer) {
        listaDevelopers.add(developer);
    }

    @Override
    public boolean delete(Integer id) {
        for (Developer dev : listaDevelopers) {
            if (dev.getId().equals(id)) {
                listaDevelopers.remove(dev);
                return true;
            }
        }
        return false;
    }
}
