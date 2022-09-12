package ch18.memento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Memento {
    private List<String> fruits = new ArrayList<>();
    private int money;

    public Memento(int money) {
        this.money = money;
    }
    public void addFruits(String ...fruits){
        Collections.addAll(this.fruits, fruits);
    }

    public int getMoney() {
        return money;
    }

    public List<String> getFruits() {
        return fruits;
    }
}
