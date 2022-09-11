package ch06.prototype;

class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        MessagePen pen1 = new MessagePen("*");
        UnderlinePen pen2 = new UnderlinePen('/');
        UnderlinePen pen3 = new UnderlinePen('-');

        manager.register("pen1", pen1);
        manager.register("pen2", pen2);
        manager.register("pen3", pen3);

        Product product1 = manager.create("pen1");
        Product product2 = manager.create("pen2");
        Product product3 = manager.create("pen3");

        product1.use("Hello");
        product2.use("Hello");
        product3.use("Hello");
        System.out.println(pen1 == product1);
        System.out.println(pen1.hashCode());
        System.out.println(product1.hashCode());
    }
}
