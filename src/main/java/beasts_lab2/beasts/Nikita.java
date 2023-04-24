package beasts_lab2.beasts;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("nekit")
public class Nikita {
    private String name = "clown";

    @Bean("getNik")
    public Nikita getNikita() {
        return new Nikita();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
