package school.lesson5;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    ArrayList<T> fruitsList;

    public Box(T... fruits) {
        this.fruitsList = new ArrayList<T>(Arrays.asList(fruits));
    }

    public void add(T... fruits) {
        this.fruitsList.addAll(Arrays.asList(fruits));
    }

    public float getWeight() {
        return fruitsList.size() != 0 ? fruitsList.size() * fruitsList.get(0).getWeight() : 0;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void pour(Box<T> box) {
        if (fruitsList.size() != 0) {
            box.fruitsList.addAll(this.fruitsList);
            fruitsList.clear();
            System.out.println("Все фрукты пересыпаны в заданную коробку.");
        } else {
            System.out.println("Фрукты в коробке отсутствуют. Ничего не пересыпано.");
        }

    }
}