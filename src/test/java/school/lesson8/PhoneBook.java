package school.lesson8;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private final HashMap<String, ArrayList<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        if (this.phoneBook.get(surname) == null) {
            ArrayList<String> tmpArrayList = new ArrayList<>();
            tmpArrayList.add(phoneNumber);
            phoneBook.put(surname, tmpArrayList);
        } else {
            this.phoneBook.get(surname).add(phoneNumber);
        }
    }

    public ArrayList<String> get(String surname) {
        if (this.phoneBook.get(surname) == null) {
            return null;
        } else {
            return this.phoneBook.get(surname);
        }
    }

    public void printNumbersForSurname(String surname) {
        ArrayList<String> foundNumbers = get(surname);
        if (foundNumbers == null) {
            System.out.println("Номеров для фамилии \"" + surname + "\" не существует!");
        } else {
            System.out.println("Номера телефонов по фамилии \"" + surname + "\": " + foundNumbers);
        }
    }
}
