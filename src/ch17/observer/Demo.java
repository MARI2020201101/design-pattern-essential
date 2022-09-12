package ch17.observer;

class Demo {
    public static void main(String[] args) {
        NumberGenerator target = new NumberGenerator();
        BasicObserver basicObserver = new BasicObserver();
        AsteriskObserver asteriskObserver = new AsteriskObserver();
        target.addObservers(basicObserver, asteriskObserver);
        target.execute();
    }
}
