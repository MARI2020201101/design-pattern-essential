package ch05.singleton;

class Main {
    public static void main(String[] args) {
        TicketMaker t1 = TicketMaker.getTicketMaker();
        TicketMaker t2 = TicketMaker.getTicketMaker();

        System.out.println(t1 == t2);
    }
}
