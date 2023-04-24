package beasts_lab2.beasts;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("dog")
public class Dog {
    private String name = "dogasssssss";

    @Bean
    public Dog getDog(Cat cat, @Qualifier("getNik") Nikita n) {
        Dog dog = new Dog();
        dog.setName(cat.getName() + "---" + n.getName());
        return dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
