package school.lesson7;

import java.util.Arrays;

public class AppData {
    private String[] headers;
    private int[][] data;

    public String[] getHeaders() {
        return headers;
    }

    public void setHeaders(String[] headers) {
        this.headers = headers;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return Arrays.toString(headers) + "\n" + Arrays.toString(data[0]) + "\n" + Arrays.toString(data[1]);
    }
}