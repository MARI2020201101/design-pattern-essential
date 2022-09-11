package ch07.genericbuilder;

class Demo {
    public static void main(String[] args) {
        Pizza pizza = BasilPizza
                .builder()
                .cheese(Pizza.CHEESE.AGRIPOM)
                .name("산양치즈 피자")
                .size(10)
                .basil(100)
                .build();
        System.out.println(pizza);
    }
}
