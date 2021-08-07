package school.lesson4.task1_5;

public class Dog extends Animal{
    private static final int MAX_RUN_LENGTH = 500;
    private static final int MAX_SWIM_LENGTH = 10;
    protected static int countDogs = 0;

    public Dog(String name, String color, int age) {
        super(name, color, age, MAX_RUN_LENGTH, MAX_SWIM_LENGTH);
        countDogs++;
    }

    public int getCountDogs() {
        return countDogs;
    }

    public static void showAmount() {
        System.out.println("Количество созданных собак: " + countDogs);
    }
}
