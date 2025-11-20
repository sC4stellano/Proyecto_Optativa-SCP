package com.example.Proyecto_Optativa.Persistence.Repository;

import java.util.ArrayList;
import java.util.List;
import com.example.Proyecto_Optativa.Persistence.Model.Technology;

public class TechnologyRepositoryImpl implements TechnologyRepository {
    private List<Technology> listaTechnologies = new ArrayList<>();

    @Override
    public void save(Technology technology) {
        listaTechnologies.add(technology);
    }

    @Override
    public boolean delete(Integer id) {
        for (Technology tech : listaTechnologies) {
            if (tech.getId().equals(id)) {
                listaTechnologies.remove(tech);
                return true;
            }
        }
        return false;
    }
}
