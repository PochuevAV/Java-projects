package Task_2;

public enum Cars {
    Car1("Lada", "Largus", "175", "950000", "Silver"),
    Car2("Nissan","Quashqai", "200", "1100000", "WhiteAndBlack"),
    Car3("Lada", "Vesta", "195", "500000", "LimeGreen"),
    Car4("Lexus", "NX250", "210", "1500000", "Black"),
    Car5("Tesla", "3", "209", "2000000", "Red" ),
    Car6("KIA", "Rio", "200", "650000", "Brown"),
    Car7("VAZ", "2114", "180", "300000", "Burgundi");
    public final String model;
    public final String speed;
    public final String mark;
    public final String price;
    public final String color;

    public String getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public String getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    Cars(String mark, String model, String speed, String price, String color) {
        this.model = model;
        this.speed = speed;
        this.mark = mark;
        this.price = price;
        this.color = color;

    }}
