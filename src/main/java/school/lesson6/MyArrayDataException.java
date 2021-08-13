package school.lesson6;

public class MyArrayDataException extends Exception {
    private int i;
    private int j;

    MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;

    }

    public void getI(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getJ() {
        return j;
    }

    @Override
    public String toString() {
        return "не удалось преобразование элемента массива. В ячейке " + (i + 1) + "x" + (j + 1) + " лежат неверные данные.";
    }
}