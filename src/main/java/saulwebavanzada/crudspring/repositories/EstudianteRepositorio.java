package saulwebavanzada.crudspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import saulwebavanzada.crudspring.entities.Estudiante;

import java.util.List;

public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long> {

    Estudiante findByNombre(String nombre);
    Estudiante findByApellido(String apellido);
    Estudiante findByMatricula(long matricula);
    Estudiante findByTelefono(long telefono);
}
