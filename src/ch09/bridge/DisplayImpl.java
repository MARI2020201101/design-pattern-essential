package ch09.bridge;

class DisplayImpl {
    public void rawOpen() {
        System.out.println("--------start---------");
    }

    public void rawClose() {
        System.out.println("--------end---------");
    }

    public void rawDisplay(String s) {
        System.out.println("* " + s + " *");
    }
}
