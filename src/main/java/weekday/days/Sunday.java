package weekday.days;

public class Sunday implements WeekDay{
    private String name = "sunday";

    @Override
    public String getWeekDayName() {
        return name;
    }
}
