package com.example.Proyecto_Optativa.Controller;

import org.springframework.http.ResponseEntity;
import java.util.List;
import com.example.Proyecto_Optativa.Service.StatusService;
import com.example.Proyecto_Optativa.Persistence.Model.Status;

public class StatusController {
    private StatusService statusService;

    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    // GET /api/v1/status
    public ResponseEntity<List<Status>> getAllStatus() {
        return ResponseEntity.ok(statusService.getAllStatus());
    }

    // GET /api/v1/status/{id}
    public ResponseEntity<Status> getStatusById(Integer id) {
        Status status = statusService.getStatusById(id);
        if (status == null) {
            return ResponseEntity.status(404).body(null);
        }
        return ResponseEntity.ok(status);
    }

    // POST /api/v1/status
    public ResponseEntity<String> createStatus(Status status) {
        statusService.addStatus(status);
        return ResponseEntity.status(201).body("Status creado correctamente");
    }

    // PUT /api/v1/status/{id}
    public ResponseEntity<String> updateStatus(Integer id, Status status) {
        status.setStatus_id(id);
        boolean ok = statusService.updateStatus(status);
        if (ok) {
            return ResponseEntity.ok("Status actualizado correctamente");
        } else {
            return ResponseEntity.status(404).body("Status no encontrado");
        }
    }

    // DELETE /api/v1/status/{id}
    public ResponseEntity<String> deleteStatus(Integer id) {
        boolean borrado = statusService.deleteStatus(id);
        if (borrado) {
            return ResponseEntity.status(204).body(null);
        } else {
            return ResponseEntity.status(404).body("Status no encontrado");
        }
    }
}
