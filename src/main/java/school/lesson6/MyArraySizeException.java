package school.lesson6;

public class MyArraySizeException extends Exception {
    @Override
    public String toString() {
        return "задан массив размера не 4х4.";
    }
}