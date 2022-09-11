package ch10.strategy;

interface Strategy {
    Hand nextHand();
    void study(boolean win);
}
