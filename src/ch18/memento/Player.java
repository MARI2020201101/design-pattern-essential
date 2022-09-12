package ch18.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Player {
    public static List<String> fruits = List.of("사과", "귤", "파인애플", "포도", "딸기", "참외");

    private List<String> myFruits = new ArrayList<>();
    private int money;
    private Random random = new Random();
    public Player(int money) {
        this.money = money;
    }

    public void bet(){
        int number = random.nextInt(6) + 1;
        switch (number){
            case 1: money+=100;break;
            case 2: money/=money;break;
            case 6: {
                String fruit = getFruit();
                System.out.println("과일 바구니에 추가 : "+ fruit);
                break;
            }
            default:
                System.out.println("do nothing...");
        }
    }

    public void restoreMemento(Memento memento){
        List<String> fruits = memento.getFruits();
        int money = memento.getMoney();
        this.myFruits = new ArrayList<>(fruits);
        this.money = money;
    }
    public Memento createMemento(){
        Memento memento = new Memento(this.money);
        for(String fruit : myFruits){
            if(fruit.endsWith("냠냠")){
                memento.addFruits(fruit);
            }
        }
        return memento;
    }
    private String getFruit() {
        int randomFruit = random.nextInt(fruits.size());
        String fruit = fruits.get(randomFruit);
        String myFruit = fruit;
        if(random.nextBoolean()){
            myFruit = fruit + "냠냠";
        }
        myFruits.add(myFruit);
        return myFruit;
    }

    public int getMoney() {
        return money;
    }
}
