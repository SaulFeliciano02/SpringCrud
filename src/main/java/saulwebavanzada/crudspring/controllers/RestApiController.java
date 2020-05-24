package saulwebavanzada.crudspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import saulwebavanzada.crudspring.entities.Estudiante;
import saulwebavanzada.crudspring.repositories.EstudianteRepositorio;

import java.util.List;

@RestController
public class RestApiController {

    @Autowired
    private EstudianteRepositorio estudianteRepositorio;

    @RequestMapping("/estudiantes")
    public List<Estudiante> showEstudiantes(){
        return estudianteRepositorio.findAll();
    }

    @RequestMapping("/guardarEstudiante")
    public Estudiante createEstudiante(){
        estudianteRepositorio.save(new Estudiante("Marcos", "De Mota", 2014123, 2131231));
        return estudianteRepositorio.findByMatricula(2014123);
    }
//    @RequestMapping("/")
//    public String holaMundo(){
//        return "/thymeleaf/index" ;
//    }

}
