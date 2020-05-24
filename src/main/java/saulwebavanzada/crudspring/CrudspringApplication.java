package saulwebavanzada.crudspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CrudspringApplication {

    public static void main(String[] args) {
        WokerServices.getInstance().addWorker(new Woker("Saul", "W-123"));
        ApplicationContext applicationContext = SpringApplication.run(CrudspringApplication.class, args);

        String[] lista = applicationContext.getBeanDefinitionNames();
        System.out.println("====== Beans Registrados =====");
        for(String bean : lista){
            System.out.println(""+bean);
        }
        System.out.println("====== FIN Beans Registrados =====");
    }

}
