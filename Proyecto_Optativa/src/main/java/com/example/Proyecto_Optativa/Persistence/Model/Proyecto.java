package com.example.Proyecto_Optativa.Persistence.Model;

import java.sql.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Proyecto {
    private Integer project_id;
    private String project_name;
    private String description;
    private Date start_date;
    private Date end_date;
    private String repository_url;
    private String demo_url;
    private String picture;
    private Status status;
    private List<Developer> desarrolladores;
    private List<Technology> tecnologias;
}
