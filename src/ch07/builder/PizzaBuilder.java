package ch07.builder;

class PizzaBuilder {
    private String name;
    private int size;

    public static PizzaBuilder builder(){
        return new PizzaBuilder();
    }

    public PizzaBuilder size(int size){
        this.size = size;
        return this;
    }

    public PizzaBuilder name(String name){
        this.name = name;
        return this;
    }

    public Pizza build(){
        return new Pizza(this);
    }

    class Pizza {
        private String name;
        private int size;
        private Pizza(PizzaBuilder pizzaBuilder) {
            this.name = pizzaBuilder.name;
            this.size = pizzaBuilder.size;
        }

        @Override
        public String toString() {
            return "Pizza{" +
                    "name='" + name + '\'' +
                    ", size=" + size +
                    '}';
        }
    }
}
