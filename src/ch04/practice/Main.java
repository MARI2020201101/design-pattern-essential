package ch04.practice;

import ch04.framework.Product;
import ch04.framework.ProductFactory;

class Main {
    public static void main(String[] args) {
        ProductFactory factory = new IdCardFactory();
        Product product1 = factory.create("김길동");
        Product product2 = factory.create("성춘향");
        Product product3 = factory.create("임꺽정");
        product1.use();
        product2.use();
        product3.use();

    }
}
