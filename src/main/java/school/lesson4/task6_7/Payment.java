package school.lesson4.task6_7;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
@NoArgsConstructor
public class Payment {
    private int id;
    private Product[] products;
    private double price;
    private static int checksAmount = 1;

    public Payment createPayment() {
        this.price = 0;
        System.out.print("Введите количество товаров для покупки: " + checksAmount + ", которое вы хотите приобрести: ");
        Scanner scanner = new Scanner(System.in);
        int amountOfProducts = scanner.nextInt();
        products = new Product[amountOfProducts];
        for (int i = 0; i < amountOfProducts; i++) {
            System.out.println("Товар " + (i + 1) + ": ");
            System.out.print("Наименование: ");
            String productName = scanner.next();
            System.out.print("Цена: ");
            int productPrice = scanner.nextInt();
            products[i] = new Product(i, productName, productPrice);
            this.price += products[i].price;
        }
        this.id = checksAmount;
        checksAmount++;
        return this;
    }

    public void printCheque() {
        if (products.length != 0) {
            System.out.println("\n===========================================");
            System.out.println("Товарный чек: " + id);
            System.out.println("===========================================");
            for (Product product : products) {
                System.out.println(product.name + " " + product.price + " UAH");
            }
            System.out.println("===========================================\n");
        }
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public static class Product {
        private int id;
        private String name;
        private double price;
    }
}
