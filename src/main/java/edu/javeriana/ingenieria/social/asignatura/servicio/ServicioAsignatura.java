package edu.javeriana.ingenieria.social.asignatura.servicio;

import edu.javeriana.ingenieria.social.asignatura.dominio.Asignatura;
import edu.javeriana.ingenieria.social.asignatura.repositorio.RepositorioAsignatura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioAsignatura {
    @Autowired
    private RepositorioAsignatura repositorio;

    public List<Asignatura> obtenerAsignaturas(){
        return repositorio.findAll();
    }

    public Asignatura obtenerAsignaturaPorCodigo(Integer codigo){
        return repositorio.findOneByCodigo(codigo);
    }

    public boolean asignaturaExiste(Integer codigo){
        return repositorio.existsByCodigo(codigo);
    }
}
