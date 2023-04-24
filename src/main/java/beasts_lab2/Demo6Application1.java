package beasts_lab2;

import beasts_lab2.beasts.Cat;
import beasts_lab2.beasts.Dog;
import beasts_lab2.beasts.Nikita;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class Demo6Application1 {

    public static void main(String[] args) {
        SpringApplication.run(Demo6Application1.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext("beasts_lab2/beasts");
        Cat cat = (Cat) context.getBean("getCat");
        Dog dog = (Dog) context.getBean("getDog");
        Nikita parrot = (Nikita) context.getBean("getNik");
        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());
    }
}
