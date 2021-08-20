package school.lesson7;

import java.io.*;

public class MainApp {
    private static final String PROJECT_PATH = System.getProperty("user.dir") + File.separator;
    private static final String TARGET_PATH = PROJECT_PATH + "target/";
    private static final String MAIN_RESOURCES_PATH = PROJECT_PATH + "src/main/resources/";

    public static void main(String[] args) {
        AppData appData = FileCSV.readFromCSV(MAIN_RESOURCES_PATH + "lesson7.csv");
        System.out.println(appData);

        appData.getHeaders()[0] = "Changed header!";
        FileCSV.saveToFile(appData, TARGET_PATH + "saved.csv ");
    }
}