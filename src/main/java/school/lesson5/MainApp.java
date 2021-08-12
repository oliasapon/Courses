package school.lesson5;

public class MainApp {
    public static void main(String[] args) {
        Changer changer = new Changer();
        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] numbers = {23, 4, 5, 2, 13, 456, -67};

        changer.<String>showElements(people);
        changer.<String>swapElements(people, 3, 3);
        changer.<String>showElements(people);
        System.out.println();
        changer.<Integer>showElements(numbers);
        changer.<Integer>swapElements(numbers, 1, 7);
        changer.<Integer>showElements(numbers);

        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Apple> box1 = new Box<Apple>(apple);
        Box<Orange> box2 = new Box<Orange>(orange, orange);
        Box<Apple> box3 = new Box<Apple>(apple);
        box1.add(apple);
        System.out.println();
        System.out.println("Вес коробки 1 c " + apple.getName() + ": " + box1.getWeight() + "\nВес одного фрукта: " + apple.getWeight());
        System.out.println("\nВес коробки 2 c " + orange.getName() + ": " + box2.getWeight() + "\nВес одного фрукта: " + orange.getWeight());

        System.out.println();
        if (box1.compare(box2)) {
            System.out.println("Коробки равны по весу.");
        } else {
            System.out.println("Коробки не равны по весу.");
        }

        System.out.println();
        System.out.println("Вес коробки 1: " + box1.getWeight());
        System.out.println("Вес коробки 3: " + box3.getWeight());
        box1.pour(box3);
        System.out.println("Вес коробки 1: " + box1.getWeight());
        System.out.println("Вес коробки 3: " + box3.getWeight());
    }
}
