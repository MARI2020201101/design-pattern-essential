package ch17.observer;

public class DemoV2 {
    public static void main(String[] args) {
        AbstractGenerator target = new IncrementalNumberGenerator(10,50,5);
        BasicObserver basicObserver = new BasicObserver();
        AsteriskObserver asteriskObserver = new AsteriskObserver();
        target.addObservers(basicObserver, asteriskObserver);
        target.execute();
    }
}
