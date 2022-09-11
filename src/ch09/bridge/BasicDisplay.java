package ch09.bridge;

class BasicDisplay {
    private DisplayImpl display;

    public BasicDisplay(DisplayImpl display) {
        this.display = display;
    }

    void open(){
        display.rawOpen();
    }
    void close(){
        display.rawClose();
    }
    void display(String s){
        display.rawDisplay(s);
    }
}
