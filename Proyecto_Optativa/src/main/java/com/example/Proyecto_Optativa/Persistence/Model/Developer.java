package com.example.Proyecto_Optativa.Persistence.Model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Developer {
    private Integer id;
    private String nombre;
    private String especialidad;

}
