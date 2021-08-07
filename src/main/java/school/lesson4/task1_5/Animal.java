package school.lesson4.task1_5;

public class Animal {
    protected String name;
    protected String color;
    protected int age;
    protected static int countAnimals = 0;
    protected int maxRunDistance = 0;
    protected int maxSwimDistance = 0;
    protected int appetite;
    protected boolean satiety = false;

    public Animal(String name, String color, int age, int maxRunDistance, int maxSwimDistance, int appetite) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.maxSwimDistance = maxSwimDistance;
        this.maxRunDistance = maxRunDistance;
        this.appetite = appetite;
        countAnimals++;
    }

    public Animal(String name, String color, int age, int maxRunDistance, int maxSwimDistance) {
        this(name, color, age, maxRunDistance, maxSwimDistance, 50);
    }

    public Animal(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        countAnimals++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.name = name;
        } else {
            System.out.println("Введен некорректный возраст!");
        }
    }

    public int getCountAnimals() {
        return countAnimals;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        if (appetite >= 0) {
            this.appetite = appetite;
        } else {
            System.out.println("Введено некорректное значение аппетита животного!");
        }
    }

    public void info() {
        System.out.println("name: " + name + " color: " + color + " age: " + age);
    }

    public void run(int length) {
        if(length < 0){
            System.out.println("Передано некорректная дистанция.");
        } else if(maxRunDistance == 0) {
            System.out.println(name + " не умеет бегать.");
        } else if(length <= maxRunDistance) {
            System.out.println(name + " пробежал " + length + " м.");
        } else {
            System.out.println(name + " не может пробежать " + length + " м. Максимум животного: " + maxRunDistance);
        }
    }

    public void swim(int length) {
        if(length < 0){
            System.out.println("Передано некорректная дистанция.");
        } else if(maxSwimDistance == 0) {
            System.out.println(name + " не умеет плавать.");
        } else if(length <= maxSwimDistance) {
            System.out.println(name + " проплыл " + length + " м.");
        } else {
            System.out.println(name + " не может проплыть " + length + " м. Максимум животного: " + maxSwimDistance);
        }
    }

    public static void showAmount() {
        System.out.println("Общее количество созданных животных: " + countAnimals);
    }

    public void eat(Plate plate) {
        satiety = plate.decreaseFood(appetite);
        if(satiety){
            System.out.println(name + " покушал и сыт!");
        } else {
            System.out.println(name + " голоден!");
        }
    }
}
