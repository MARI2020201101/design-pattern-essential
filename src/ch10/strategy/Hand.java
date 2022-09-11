package ch10.strategy;

class Hand {
    private Value value;

    public int value(){
        return value.getValue();
    }
    public Hand(int handValue) {
        for(Value v : Value.values()){
            if(v.whatis(handValue)) {
                this.value = v;
            }
        }
    }

    @Override
    public String toString() {
        return value.name;
    }

    public static enum Value{
        ROCK(0 , "주먹"), SCISSOR(1, "가위"), PATER(2, "보");
        private final int value;
        private final String name;
        Value(int value, String name){
            this.value = value;
            this.name = name;
        }

        public int getValue() {
            return value;
        }

        public boolean whatis(int value){
            return (getValue() == value);
        }
        boolean isWeakerThan(Hand hand){
            return !fight(hand);
        }
        boolean isStrongerThan(Hand hand){
            return fight(hand);
        }

        private boolean fight(Hand hand) {
            return (getValue()+1)%3 == hand.value.getValue();
        }
    }
}
