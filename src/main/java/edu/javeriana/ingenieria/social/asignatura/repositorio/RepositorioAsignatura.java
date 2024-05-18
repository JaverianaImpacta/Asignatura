package edu.javeriana.ingenieria.social.asignatura.repositorio;

import edu.javeriana.ingenieria.social.asignatura.dominio.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioAsignatura extends JpaRepository<Asignatura, Integer> {
    Asignatura findOneByCodigo(Integer codigo);

    boolean existsByCodigo(Integer codigo);
}