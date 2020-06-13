package saulwebavanzada.crudspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import saulwebavanzada.crudspring.entities.Estudiante;
import saulwebavanzada.crudspring.services.EstudianteServicio;

import java.util.List;

@Controller //indica que es un controlador.
//@RestController
public class EstudianteControlador {

    @Autowired
    public EstudianteServicio estudianteServicio;

    @RequestMapping(path = "/listar")
    public String listarEstudiantes(Model model){
        model.addAttribute("listaEstudiantes", estudianteServicio.getEstudiantes());
        return "thymeleaf/index";
    }

    @RequestMapping(path = "/crear")
    public String crearEstudiante(Model model, @RequestParam(name = "nombre") String nombre,
                                   @RequestParam(name = "apellido") String apellido,
                                   @RequestParam(name = "telefono") long telefono,
                                   @RequestParam(name = "matricula") long matricula){
        Estudiante estudiante = new Estudiante(nombre, apellido, matricula, telefono);
        estudianteServicio.crearEstudiante(estudiante);
        return "redirect:/listar";
    }

    @RequestMapping(path = "/editar")
    public String editarEstudiante(Model model, @RequestParam(name = "nombre") String nombre,
                                   @RequestParam(name = "apellido") String apellido,
                                   @RequestParam(name = "telefono") long telefono,
                                   @RequestParam(name = "matricula") long matricula){
        Estudiante estudiante = new Estudiante(nombre, apellido, matricula, telefono);
        estudianteServicio.editarEstudiante(estudiante);
        return "redirect:/listar";
    }

    @RequestMapping(path = "/eliminar/{matricula}")
    public String eliminarEstudiante(Model model, @PathVariable(name = "matricula") long matricula){
        estudianteServicio.eliminarEstudiante(matricula);
        return "redirect:/listar";
    }

    @RequestMapping(path = "/buscar/{matricula}")
    public String buscarEstudiante(Model model, @PathVariable(name = "matricula") long matricula){
        model.addAttribute("listaEstudiantes", estudianteServicio.getEstudianteByMatricula(matricula));
        return "thymeleaf/index";
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

