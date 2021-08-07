package school.lesson4.task8;

public class Circle extends Figures{
    protected int r;

    public Circle(int r, String colorBackground, String colorBorders){
        super(colorBackground, colorBorders);
        this.r = r;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public String info (){
        return "Параметры круга: " + r + "." + super.info();
    }
}