package ch18.memento;

class Game {
    public static void main(String[] args) {
        Player player = new Player(100);
        Memento memento = player.createMemento();

        for(int i = 0; i <200 ; i++){
            System.out.println("[" + i + "] Game Round");
            player.bet();
            if(player.getMoney() < (memento.getMoney()/2)){
                System.out.println("돈이 없다...." + player.getMoney() + "원 => " + memento.getMoney() + "원");
                player.restoreMemento(memento);
            }else if(player.getMoney() > memento.getMoney()){
                System.out.println("현재 상태를 보존하자!! " + player.getMoney() + "원");
                Memento newMemento = player.createMemento();
                memento = newMemento;
                System.out.print("과일 : ");
                memento.getFruits().forEach(f-> System.out.print(f + " , "));
                System.out.println();
            }
        }
    }
}
