package saulwebavanzada.crudspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import saulwebavanzada.crudspring.entities.Estudiante;
import saulwebavanzada.crudspring.repositories.EstudianteRepositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServicio {
    @Autowired
    private EstudianteRepositorio estudianteRepositorio;

    public List<Estudiante> getEstudiantes(){
        return estudianteRepositorio.findAll();
    }

    public Estudiante getEstudianteByMatricula(long matricula){
        return estudianteRepositorio.findByMatricula(matricula);
    }

    public Estudiante getEstudianteByTelefono(long telefono){
        return estudianteRepositorio.findByTelefono(telefono);
    }

    public Estudiante getEstudianteByNombre(String nombre){
        return estudianteRepositorio.findByNombre(nombre);
    }

    public Estudiante getEstudianteByApellido(String apellido){
        return estudianteRepositorio.findByApellido(apellido);
    }


    @Transactional
    public boolean crearEstudiante(Estudiante estudiante){
        if(estudianteRepositorio.findByMatricula(estudiante.getMatricula()) != null){
            return false;
        }
        estudianteRepositorio.save(estudiante);
        return true;
    }

    @Transactional
    public boolean eliminarEstudiante(long matricula){
        Estudiante estudiante = estudianteRepositorio.findByMatricula(matricula);
        if(estudiante != null){
            estudianteRepositorio.delete(estudiante);
            return true;
        }
        return false;
    }

    @Transactional
    public boolean editarEstudiante(Estudiante estudiante){
        Optional<Estudiante> e = Optional.ofNullable(estudianteRepositorio.findByMatricula(estudiante.getMatricula()));
        if(e.isPresent()){
            Estudiante nuevoEstudiante = e.get();
            nuevoEstudiante.setApellido(estudiante.getApellido());
            nuevoEstudiante.setNombre(estudiante.getNombre());
            nuevoEstudiante.setTelefono(estudiante.getTelefono());
            nuevoEstudiante.setMatricula(estudiante.getMatricula());
            return true;
        }
        return false;
    }
}
