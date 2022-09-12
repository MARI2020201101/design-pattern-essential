package ch17.observer;

interface Observer {
    void update(AbstractGenerator target);
}
class BasicObserver implements Observer{

    @Override
    public void update(AbstractGenerator target) {
        System.out.print(target.getNumber() + " ");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {}
    }
}

class AsteriskObserver implements Observer{

    @Override
    public void update(AbstractGenerator target) {
        int number = target.getNumber();
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}