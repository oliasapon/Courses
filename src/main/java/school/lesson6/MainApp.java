package school.lesson6;

public class MainApp {
    public static void main(String[] args) {
        Transformation example = new Transformation();
        String[][] array = {{"2", "13", "35", "23"}, {"11", "5", "21", "67"}, {"45", "9", "1", "98"}, {"12", "4", "76", "43"}};
        String[][] array1 = {{"2", "13", "35", "23"}, {"11", "5", "21", "67"}, {"gfhfgh", "9", "1", "98"}, {"12", "4", "76", "43"}};
        String[][] array2 = {{"2", "13", "35"}, {"11", "5", "21"}, {"56", "9", "1",}, {"56", "9", "1",}};
        int sum = 0;
        try {
            sum = example.transformationArray(array2);
            System.out.println("Сумма всех элементов массива составляет: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}