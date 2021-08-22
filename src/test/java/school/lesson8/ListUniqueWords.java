package school.lesson8;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListUniqueWords {
    public void printUniqueWords(List<String> arr) {
        Set<String> uniqueWords = new HashSet<>(arr);
        System.out.println("Список уникальных слов: " + uniqueWords + ".");
    }

    public void printWordCount(List<String> arr) {
        Set<String> uniqueWords = new HashSet<>();
        System.out.println("Массив содержит: ");
        for (String word : arr) {
            if (uniqueWords.add(word)) {
                System.out.println(Collections.frequency(arr, word) + " " + word + ";");
            }
        }
    }
}