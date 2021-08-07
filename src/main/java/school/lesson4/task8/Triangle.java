package school.lesson4.task8;

public class Triangle extends Figures {
    protected int a;
    protected int b;
    protected int c;

    public Triangle(int a, int b, int c, String colorBackground, String colorBorders) {
        super(colorBackground, colorBorders);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double square() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String info (){
        return "Параметры треугольника: " + a + ", " + b + ", " + c + "." + super.info();
    }
}