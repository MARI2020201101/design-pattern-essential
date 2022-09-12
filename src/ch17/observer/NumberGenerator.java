package ch17.observer;

import java.util.Random;

public class NumberGenerator extends AbstractGenerator{

    private final Random random = new Random();
    private int number;

    @Override
    int getNumber() {
        return number;
    }

    @Override
    void execute() {
        for (int i = 0; i < 50; i++) {
            generate();
            notifyObservers();
        }
    }


    private void generate() {
       number = random.nextInt(100);
    }
}
