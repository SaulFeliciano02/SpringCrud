package saulwebavanzada.crudspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller() //indica que es un controlador.
//@RequestMapping(path = "/")
public class ThymeleafController {

    /**
//     * Llamada a la vista index.html con la platilla thymeleaf
//     * @param model
//     * Representa el modelo que será pasado en la vista.
//     * @param name
//     * Valor como parametro.
//     *
     * Para ejecutar: http://localhost:8080/
     * @return
     */
    @RequestMapping(path = "/index")
    public String index(){
        //
        // direccioando a la vista.
        //remover el / del inicio de las direcciones para que funcione en docker ej: "/thymeleaf/index" a "thymeleaf/index"
        return "thymeleaf/index";
    }
}
