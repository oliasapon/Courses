package school.lesson8;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        String[] initialArray = new String[]{"альфa", "бета", "бета", "альфa", "этa", "гaммa", "эпсилон", "омeгa", "этa", "этa"};
        List<String> transformedArray = Arrays.asList(initialArray);
        ListUniqueWords list = new ListUniqueWords();
        list.printUniqueWords(transformedArray);
        list.printWordCount(transformedArray);

        System.out.println("");
        PhoneBook phoneBook = new PhoneBook();
        String surname = "Петров";
        phoneBook.add(surname, "0773412365");
        phoneBook.add(surname, "0883412365");
        phoneBook.add(surname, "0993412365");
        phoneBook.printNumbersForSurname(surname);
        phoneBook.printNumbersForSurname("Иванов");
    }
}