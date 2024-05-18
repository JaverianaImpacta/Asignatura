package edu.javeriana.ingenieria.social.asignatura.controlador;

import edu.javeriana.ingenieria.social.asignatura.dominio.Asignatura;
import edu.javeriana.ingenieria.social.asignatura.servicio.ServicioAsignatura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asignaturas")
@CrossOrigin(origins="http://localhost:4200")
public class ControladorAsignatura {

    @Autowired
    private ServicioAsignatura servicio;

    @GetMapping("listar")
    public List<Asignatura> listar() {
        return servicio.obtenerAsignaturas();
    }

    @GetMapping("obtener")
    public ResponseEntity<Asignatura> obtenerAsignatura(@RequestParam Integer codigo) {
        if (codigo == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if(!servicio.asignaturaExiste(codigo)){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(servicio.obtenerAsignaturaPorCodigo(codigo), HttpStatus.OK);
    }
}
