package ch17.hanoi;

import java.util.concurrent.atomic.AtomicInteger;

class Hanoi {
    static AtomicInteger count = new AtomicInteger(0);
    public static void main(String[] args) {
        hanoi(6,"A", "B", "C");
        System.out.println("횟수 : " +count);
    }
    static void hanoi(int level, String a, String b, String c){
        if(level == 0) return;

        count.addAndGet(1);
        hanoi(level-1,c,b,a);
        System.out.print(a +" => " +c + " , ");
        hanoi(level-1, a, c,b);

    }
}
