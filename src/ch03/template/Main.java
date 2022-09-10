package ch03.template;

class Main {
    public static void main(String[] args) {
        AbstractDisplay charDisplay = new CharDisplay('H');
        AbstractDisplay stringDisplay = new StringDisplay("Hello World!");
        charDisplay.display();
        stringDisplay.display();
    }
}
