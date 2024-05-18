package edu.javeriana.ingenieria.social.asignatura.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Asignatura {
    @Id
    private Integer id;
    private Integer codigo, creditos, departamento;
    private String nombre;
}
