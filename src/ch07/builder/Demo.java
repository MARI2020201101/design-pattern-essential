package ch07.builder;

class Demo {
    public static void main(String[] args) {
        PizzaBuilder.Pizza pizza = PizzaBuilder
                .builder()
                .name("냠냠피자")
                .size(10)
                .build();
        System.out.println(pizza);
    }
}
