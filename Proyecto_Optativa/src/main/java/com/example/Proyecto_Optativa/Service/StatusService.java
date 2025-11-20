package com.example.Proyecto_Optativa.Service;

import com.example.Proyecto_Optativa.Persistence.Repository.StatusRepository;
import com.example.Proyecto_Optativa.Persistence.Model.Status;
import java.util.List;

public class StatusService {

    private final StatusRepository statusRepository;

    public StatusService(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    public List<Status> getAllStatus() {
        return statusRepository.findAll();
    }

    public Status getStatusById(Integer id) {
        return statusRepository.findById(id);
    }

    public void addStatus(Status status) {
        statusRepository.save(status);
    }

    public boolean updateStatus(Status status) {
        if (statusRepository.findById(status.getStatus_id()) != null) {
            statusRepository.update(status);
            return true;
        }
        return false; // No se encontró el Status para actualizar
    }

    public boolean deleteStatus(Integer id) {
        if (statusRepository.findById(id) != null) {
            statusRepository.delete(id);
            return true;
        }
        return false; // No se encontró el Status para borrar
    }
}
