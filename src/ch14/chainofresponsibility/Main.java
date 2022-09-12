package ch14.chainofresponsibility;

class Main {
    public static void main(String[] args) {
        Support support = new OddSupport();
        Support support1 = new SpecificSupport(99);
        Support support2 = new SpecificSupport(66);
        Support support3 = new NoSupport();
        Support support4 = new LowerBoundSupport(33);

        support3.setNext(support1).setNext(support2).setNext(support4).setNext(support);

        for (int i = 0; i < 100; i++) {
            Trouble trouble = new Trouble(i);
            support3.support(trouble);
        }
    }
}
