package ch06.prototype;

interface Product extends Cloneable{
    void use(String s);
    Product createClone();
}
class UnderlinePen implements Product{
    private final char c ;
    UnderlinePen(char c) {
        this.c = c;
    }
    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length+6; i++) {
            System.out.print(c);
        }
        System.out.println();
        System.out.print(" / "+ s + " /");
        System.out.println();
        for (int i = 0; i < length+6; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
    @Override
    public Product createClone() {
        Product p = null;
        try {
           p = (Product) clone();
        } catch (CloneNotSupportedException e) {}
        return p;
    }
}
class MessagePen implements Product{
    private final String message;
    MessagePen(String message) {
        this.message = message;
    }
    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length+6; i++) {
            System.out.print(message);
        }
        System.out.println();
        System.out.println(" / "+ s + " /");

        for (int i = 0; i < length+6; i++) {
            System.out.print(message);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {}
        return p;
    }
}