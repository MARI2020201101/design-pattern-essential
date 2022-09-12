package ch14.forloop;

class Trouble {
    private final int number;

    Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "[Trouble No." + number +"]";
    }
}
