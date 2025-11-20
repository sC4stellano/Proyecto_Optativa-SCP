package com.example.Proyecto_Optativa.Persistence.Repository;

import java.util.ArrayList;
import java.util.List;
import com.example.Proyecto_Optativa.Persistence.Model.Status;

public class StatusRepositoryImpl implements StatusRepository {
    private List<Status> listaStatus = new ArrayList<>();

    @Override
    public List<Status> findAll() {
        return new ArrayList<>(listaStatus);
    }

    @Override
    public Status findById(Integer id) {
        for (Status s : listaStatus) {
            if (s.getStatus_id().equals(id)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void save(Status status) {
        listaStatus.add(status);
    }

    @Override
    public boolean update(Status status) {
        for (int i = 0; i < listaStatus.size(); i++) {
            if (listaStatus.get(i).getStatus_id().equals(status.getStatus_id())) {
                listaStatus.set(i, status);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        for (Status s : listaStatus) {
            if (s.getStatus_id().equals(id)) {
                listaStatus.remove(s);
                return true;
            }
        }
        return false;
    }
}
