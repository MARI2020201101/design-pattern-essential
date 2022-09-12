package ch14.chainofresponsibility;

class OddSupport extends Support{
    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() % 2 == 1;
    }
}
class NoSupport extends Support{
    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
class SpecificSupport extends Support{

    private final int specificNumber;
    SpecificSupport(int specificNumber) {
        this.specificNumber = specificNumber;
    }
    @Override
    protected boolean resolve(Trouble trouble) {
        return specificNumber == trouble.getNumber();
    }
}
class LowerBoundSupport extends Support{
    private final int lowerBoundNumber;

    LowerBoundSupport(int lowerBoundNumber) {
        this.lowerBoundNumber = lowerBoundNumber;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() < lowerBoundNumber;
    }
}
