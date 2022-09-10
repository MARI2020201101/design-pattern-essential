package ch03.template;

abstract class AbstractDisplay {
    abstract void open();
    abstract void close();
    abstract void print();
    void display(){
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}

class CharDisplay extends AbstractDisplay{
    private final char c;
    CharDisplay(char c) {
        this.c = c;
    }
    @Override
    void open() {
        System.out.print("<<");
    }
    @Override
    void close() {
        System.out.println(">>");
    }
    @Override
    void print() {
        System.out.print(c);
    }
}

class StringDisplay extends AbstractDisplay{
    private final String str;
    private final int width;
    StringDisplay(String str) {
        this.str = str;
        this.width = str.length() +2;
    }
    @Override
    void open() {
        System.out.println(printLine());
    }

    private String printLine() {
        StringBuffer sb = new StringBuffer();
        sb.append("+");
        for (int i = 0; i < width; i++) {
            sb.append("-");
        }
        sb.append("+");
        return sb.toString();
    }

    @Override
    void close() {
        System.out.println(printLine());
    }

    @Override
    void print() {
        System.out.println("| " + str + " |");
    }
}