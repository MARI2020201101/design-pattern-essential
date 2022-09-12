package ch17.observer;

public class IncrementalNumberGenerator extends AbstractGenerator{
    private final int start, end, incremental;
    private int number;
    public IncrementalNumberGenerator(int start, int end, int incremental) {
        this.start = start;
        this.end = end;
        this.incremental = incremental;
    }

    @Override
    int getNumber() {
        return number;
    }

    @Override
    void execute() {
        for(int i = start ; i <= end ; i+= incremental){
            this.number = i;
            notifyObservers();
        }
    }
}
