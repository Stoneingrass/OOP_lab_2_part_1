package weekday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import weekday.days.*;


@SpringBootApplication
public class Demo6Application2 {

    public static void main(String[] args) {
        SpringApplication.run(Demo6Application2.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext("configs", "weekday/days");

        WeekDay weekDay = context.getBean(WeekDay.class);
        System.out.println("It's " + weekDay.getWeekDayName() + " today!");
    }
}
