package school.lesson4.task1_5;

public class Cat extends Animal{
    private static final int MAX_RUN_LENGTH = 200;
    private static final int MAX_SWIM_LENGTH = 0;
    protected static int countCats = 0;

    public Cat(String name, String color, int age) {
        super(name, color, age,MAX_RUN_LENGTH,MAX_SWIM_LENGTH);
        countCats++;
    }

    public Cat(String name, int appetite) {
        super(name, appetite);
        countCats++;
    }

    public Cat(String name, String color, int age, int appetite) {
        super(name, color, age,MAX_RUN_LENGTH,MAX_SWIM_LENGTH, appetite);
        countCats++;
    }

    public int getCountCats() {
        return countCats;
    }

    public static void showAmount() {
        System.out.println("Количество созданных котов: " + countCats);
    }

}
