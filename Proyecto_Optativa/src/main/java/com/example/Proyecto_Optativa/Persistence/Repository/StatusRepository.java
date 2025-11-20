package com.example.Proyecto_Optativa.Persistence.Repository;

import com.example.Proyecto_Optativa.Persistence.Model.Status;
import java.util.List;

public interface StatusRepository {
    List<Status> findAll();

    Status findById(Integer id);

    void save(Status status);

    boolean update(Status status);

    boolean delete(Integer id);

}