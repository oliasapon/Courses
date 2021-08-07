package school.lesson4.task1_5;

public class Plate {
    private int currentFood;
    private final int maxFood;

    public Plate(int currentFood, int maxFood) {
        this.currentFood = Math.min(currentFood, maxFood);
        this.maxFood = maxFood;
    }

    public int getCurrentFood() {
        return currentFood;
    }

    public void setCurrentFood(int currentFood) {
        if (currentFood >= 0 && currentFood <= maxFood) {
            this.currentFood = currentFood;
        } else {
            System.out.println("Введено некорректное значение еды!");
        }
    }

    public int getMaxFood() {
        return maxFood;
    }

    public boolean decreaseFood(int appetite) {
        if (currentFood >= appetite) {
            currentFood -= appetite;
            return true;
        } else {
            System.out.println("У животного аппетит больше, чем количетсво еды в тарелке! Животное не поело.");
            return false;
        }
    }

    public void info() {
        System.out.println("Текущее количество еды в миске: " + currentFood + ". Максимальное количество еды в миске: " + maxFood);
    }

    public void addFood(int amountAdd) {
        if (amountAdd <= 0) {
            System.out.println("Задано неверное количество еды для добавления!");
        } else if ((currentFood + amountAdd) <= maxFood) {
            currentFood += amountAdd;
            System.out.println("Добавлено " + amountAdd + "еды.");
        } else {
            currentFood = maxFood;
            System.out.println("Попытались добавить больше еды, чем вмечает миска. Заполнено до максимума!");
        }
    }

    public void fill(){
        if(currentFood == maxFood){
            System.out.println("Миска уже заполнена полностью!");
        } else {
            currentFood = maxFood;
            System.out.println("Миска заполнилась полностью!");
        }
    }
}

