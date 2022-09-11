package ch10.strategy;

import java.util.Random;

class PercentStrategy implements Strategy{
    private int[][] history ={
            {1,1,1},
            {1,1,1},
            {1,1,1}
    };
    private Hand prevHand;
    private Hand currHand;
    private Random random = new Random();


    @Override
    public Hand nextHand() {
        int bet = random.nextInt(totalCount(currHand.value()));
        int next;
        if(bet < history[currHand.value()][0]){
            next = 0;
        }else if(bet < history[currHand.value()][0] + history[currHand.value()][1]){
            next = 1;
        }else next = 2;

        return new Hand(next);
    }

    @Override
    public void study(boolean win) {
        if(win){
            history[prevHand.value()][currHand.value()]++;
        }else{
            history[prevHand.value()][( currHand.value()+1 ) % 3]++;
            history[prevHand.value()][( currHand.value()+2 ) % 3]++;
        }

    }

    private int totalCount(int handValue){
        int result=0;
        for(int i = 0; i < history[0].length; i++){
            result += history[handValue][i];
        }
        return result;
    }
}
