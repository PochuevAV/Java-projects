package Task_2;

public enum MarkAndColor {
    Silver("Серебряный"),
    WhiteAndBlack("Черно-белый"),
    LimeGreen("Лаймово-зелёный"),
    Black("Чёрный"),
    Red("Красный"),
    Brown("Коричневый"),
    Burgundi("Вишнёвый"),
    Lada("Лада"),
    Nissan("Ниссан"),
    Lexus("Лексус"),
    Tesla("Тесла"),
    KIA("КИА"),
    VAZ("ВАЗ");
public String name;

    public String getName() {
        return name;
    }

    MarkAndColor(String name) {
        this.name = name;
    }
}
