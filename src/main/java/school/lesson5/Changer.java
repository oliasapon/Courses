package school.lesson5;

public class Changer {

    public <T> void swapElements(T[] array, int firstPosition, int secondPosition) {
        if (firstPosition > 0 && firstPosition <= array.length && secondPosition != firstPosition && secondPosition <= array.length) {
            T temporary = array[firstPosition - 1];
            array[firstPosition - 1] = array[secondPosition - 1];
            array[secondPosition - 1] = temporary;
            System.out.println("Элементы с расположением " + firstPosition + " и " + secondPosition + " поменяны местами!");
        } else {
            System.out.println("Неверно указано расположение элементов массива для замены.");
        }
    }

    public <T> void showElements(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
