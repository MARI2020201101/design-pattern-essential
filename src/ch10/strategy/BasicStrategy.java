package ch10.strategy;

import java.util.Random;

class BasicStrategy implements Strategy{
    private boolean won;
    private Random random = new Random();
    private Hand prevHand;

    @Override
    public Hand nextHand() {
        if(won) return prevHand;
        else return new Hand(random.nextInt(3));
    }

    @Override
    public void study(boolean win) {
        this.won = win;
    }
}
