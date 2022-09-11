package ch07.genericbuilder;

abstract class Pizza {
    public enum CHEESE{ANTICASEIPICHO, AGRIPOM}
    protected int size;
    protected String name;
    protected CHEESE cheese;

    abstract static class Builder<T extends Builder<T>>{

        protected CHEESE cheese;
        protected int size;
        protected String name;
        public T cheese(CHEESE cheese){
            this.cheese = cheese;
            return self();
        }
        public T size(int size){
            this.size = size;
            return self();
        }
        public T name(String name){
            this.name = name;
            return self();
        }
        protected abstract T self();
        protected abstract Pizza build();
    }
}
