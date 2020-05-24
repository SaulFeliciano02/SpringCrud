package saulwebavanzada.crudspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import saulwebavanzada.crudspring.services.EstudianteServicio;

import java.util.List;

@Controller //indica que es un controlador.
//@RestController
public class EstudianteControlador {

    @Autowired
    public EstudianteServicio estudianteServicio;

    @RequestMapping(path = "/listar")
    public String listarEstudiantes(Model model){
        return "index";
    }

    /**@RequestMapping(path = "buscar/{matricula}")
    public Estudiante buscarEstudiante(@PathVariable int matricula){
    return EstudianteServicio.getInstance().buscarEstudiante(matricula);
    }

     @RequestMapping(path = "eliminar/{matricula}")
     public void eliminarEstudiante(@PathVariable int matricula){
     EstudianteServicio.getInstance().eliminarEstudiante(matricula);
     return;
     }

     @RequestMapping(path = "validar/{matricula}")
     public boolean validarMatricula(@PathVariable int matricula){
     return EstudianteServicio.getInstance().validarMatricula(matricula);
     }**/
}

