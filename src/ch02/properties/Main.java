package ch02.properties;

import java.io.IOException;
import java.nio.file.Paths;

class Main {
    private static String SRC = "src/ch02/properties/file.txt";
    private static String DIR = "src/ch02/properties/newfile.txt";
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile(SRC);
            f.setValue("year", "2000");
            f.setValue("month", "11");
            f.setValue("day", "20");
            f.writeToFile(DIR);
        } catch (IOException e) {}

    }
}
