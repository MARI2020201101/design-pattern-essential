package ch02.properties;

import java.io.*;
import java.util.Properties;

interface FileIO {
    void readFromFile(String fileName) throws IOException;
    void writeToFile(String fileName) throws IOException;
    void setValue(String key, String value) throws IOException;
    String getValue(String key) throws IOException;
}
class FileProperties implements FileIO{

    private final Properties properties = new Properties();

    @Override
    public void readFromFile(String fileName) throws IOException {
        InputStream stream = new FileInputStream(fileName);
        properties.load(stream);
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        OutputStream stream = new FileOutputStream(fileName);
        properties.store(stream, "written by " + this.getClass().toString());
    }

    @Override
    public void setValue(String key, String value) throws IOException {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) throws IOException {
        return properties.getProperty(key);
    }
}