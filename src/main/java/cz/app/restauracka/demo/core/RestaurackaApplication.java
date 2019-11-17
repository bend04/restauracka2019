package cz.app.restauracka.demo.core;

import cz.app.restauracka.demo.logika.zam.Manager;
import cz.app.restauracka.demo.logika.zam.TestovaciEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestaurackaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RestaurackaApplication.class, args);

        TestovaciEntity testovaciEntity = context.getBean(TestovaciEntity.class);

        Manager manager = context.getBean(Manager.class);

        System.out.println(manager.getJmeno());
    }


}
