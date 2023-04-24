package beasts_lab2.beasts;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("cat")

public class Cat {
    private String name = "catasssssssssssssssssss";

    @Bean
    public Cat getCat(@Qualifier("getNik") Nikita n) {
        Cat cat = new Cat();
        cat.setName(n.getName() + "-Iva");
        return cat;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
