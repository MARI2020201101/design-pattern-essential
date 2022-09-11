package ch09.bridge;

class MultiDisplay extends BasicDisplay{

    //기능과 구현을 분리하는 것이 bridge 패턴
    //기능은 강결합 구현은 약결합
    public MultiDisplay(DisplayImpl display) {
        super(display);
    }

    public void multiDisplay(String s){
        open();
        for (int i = 0; i < 10; i++) {
            display(s);
        }
        close();
    }
}
