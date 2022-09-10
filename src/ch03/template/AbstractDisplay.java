package ch03.template;

abstract class AbstractDisplay {
    protected abstract void open();
    protected abstract void close();
    protected abstract void print();
    final void display(){
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
    protected void open() {
        System.out.print("<<");
    }
    @Override
    protected void close() {
        System.out.println(">>");
    }
    @Override
    protected void print() {
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
    protected void open() {
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
    protected void close() {
        System.out.println(printLine());
    }

    @Override
    protected void print() {
        System.out.println("| " + str + " |");
    }
}