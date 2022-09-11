package ch07.genericbuilder;

class BasilPizza extends Pizza{
    protected int basilGram;
    public BasilPizza(Builder builder) {
        this.basilGram = builder.basilGram;
        this.name = builder.name;
        this.size = builder.size;
        this.cheese = builder.cheese;
    }

    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "BasilPizza{" +
                "basilGram=" + basilGram +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", cheese=" + cheese +
                '}';
    }

    static class Builder extends Pizza.Builder<Builder> {
        private int basilGram;

        public Builder basil(int basilGram){
            this.basilGram = basilGram;
            return self();
        }
        @Override
        protected Builder self() {
            return this;
        }

        @Override
        protected Pizza build() {
            return new BasilPizza(this);
        }
    }
}
