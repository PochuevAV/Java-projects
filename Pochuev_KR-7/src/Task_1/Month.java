package Task_1;

public enum Month {
    January("Январь", 1),
    February("Февраль", 2),
    March("Март", 3),
    April("Апрель", 4),
    May("Май", 5),
    June("Июнь", 6),
    July("Июль", 7),
    August("Август", 8),
    September("Сентябрь", 9),
    October("Октябрь", 10),
    November("Ноябрь", 11),
    December("Декабрь", 12);
    private final String name;
    private final int number;

    Month(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}

