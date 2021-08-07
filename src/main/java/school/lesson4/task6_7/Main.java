package school.lesson4.task6_7;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.print("Введите количество  покупок, которое вы хотите совершить: ");
        Scanner scanner = new Scanner(System.in);
        int amountOfPayments = scanner.nextInt();
        if (amountOfPayments > 0) {
            Payment[] payments = new Payment[amountOfPayments];
            for (Payment payment : payments) {
                payment = new Payment();
                payment.createPayment().printCheque();
            }
        }
    }
}
