package ch23.interpreter;

import java.io.BufferedReader;
import java.io.FileReader;

class Main {
    static String fileName = "src/ch23/interpreter/program.txt";
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String text;
            while((text = reader.readLine())!=null){
                System.out.println("text = \""+text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = "+ node);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
