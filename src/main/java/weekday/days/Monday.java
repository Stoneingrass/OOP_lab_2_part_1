package weekday.days;

public class Monday implements WeekDay {
    private String name = "monday";

    @Override
    public String getWeekDayName() {
        return name;
    }
}
