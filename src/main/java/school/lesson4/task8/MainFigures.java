package school.lesson4.task8;

public class MainFigures {
    public static void main(String[] args) {
        System.out.println(new Triangle(3, 5, 4, "red", "white").info());
        System.out.println(new Circle(3, "red", "white").info());
        System.out.println(new Rectangle(3, 5, "red", "white").info());
    }
}
