package ch05.triple;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Triple {
    private int number;
    private static final Map<Integer, Triple> triples = new HashMap<>();
    private static final Random random = new Random();

    private Triple(int number){
        this.number = number;
    }
    static {
        triples.put(0, new Triple(0));
        triples.put(1, new Triple(1));
        triples.put(2, new Triple(2));
    }

    static Triple getInstance(){
        int i = random.nextInt(1000);
        int randomTripleNumber = i%3;
        return triples.get(randomTripleNumber);
    }

    @Override
    public String toString() {
        return "Triple{" +
                "number=" + number +
                '}';
    }
}
