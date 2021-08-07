package school.lesson4.task8;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Figures implements Calculation{
    protected String colorBackground;
    protected String colorBorders;

    public String info() {
        return " Периметр: " + perimeter() + ", площадь: " + square() + ", цвет фона: " + colorBackground + ", цвет границ: " + colorBorders;
    }
}
