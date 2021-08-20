package school.lesson7;

import java.io.*;

public class FileCSV {
    public static AppData readFromCSV(String pathToFile) {
        AppData appData = new AppData();
        try {
            File file = new File(pathToFile);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            appData.setHeaders(bufferedReader.readLine().split(";"));
            int[][] tmpValueArr = new int[appData.getHeaders().length][appData.getHeaders().length];
            tmpValueArr[0] = stringArrayToIntArray(bufferedReader.readLine().split(";"));
            tmpValueArr[1] = stringArrayToIntArray(bufferedReader.readLine().split(";"));
            appData.setData(tmpValueArr);
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return appData;
    }

    public static void saveToFile(AppData appData, String pathToFile) {
        try {
            FileWriter writer = new FileWriter(pathToFile);
            for (String string : appData.getHeaders()) {
                writer.append(string).append(";");
            }
            writer.append("\n");
            for (int number : appData.getData()[0]) {
                writer.append(String.valueOf(number)).append(";");
            }
            writer.append("\n");
            for (int number : appData.getData()[1]) {
                writer.append(String.valueOf(number)).append(";");
            }
            writer.flush();
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static int[] stringArrayToIntArray(String[] stringArray) {
        int[] numbers = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            numbers[i] = Integer.parseInt(stringArray[i]);
        }
        return numbers;
    }
}