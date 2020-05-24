package saulwebavanzada.crudspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import saulwebavanzada.crudspring.entities.Estudiante;
import saulwebavanzada.crudspring.repositories.EstudianteRepositorio;

@SpringBootApplication
public class CrudspringApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(CrudspringApplication.class, args);

        String[] lista = applicationContext.getBeanDefinitionNames();
        System.out.println("====== Beans Registrados =====");
        for(String bean : lista){
            System.out.println(""+bean);
        }
        System.out.println("====== FIN Beans Registrados =====");
    }

}
