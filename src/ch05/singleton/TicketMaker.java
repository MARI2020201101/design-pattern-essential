package ch05.singleton;

class TicketMaker {
    private int ticket = 100;
    private TicketMaker(){}

    public static TicketMaker getTicketMaker(){
        return TicketHolder.getInstance();
    }

    static class TicketHolder{
        private static TicketMaker INSTANCE = new TicketMaker();
        static TicketMaker getInstance(){
            return INSTANCE;
        }
    }
}
