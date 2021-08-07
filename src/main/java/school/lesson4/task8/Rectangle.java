package school.lesson4.task8;

public class Rectangle extends Figures{
    protected int a;
    protected int b;

    public Rectangle(int a, int b, String colorBackground, String colorBorders){
        super(colorBackground, colorBorders);
        this.a = a;
        this.b = b;
    }

    @Override
    public double perimeter() {
        return a * 2 + b * 2;
    }

    @Override
    public double square() {
        return a * b;
    }

    @Override
    public String info (){
        return "Параметры прямоугольника: " + a + ", " + b + "." + super.info();
    }
}