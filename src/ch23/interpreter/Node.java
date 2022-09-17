package ch23.interpreter;

abstract class Node {
    abstract void parse(Context context) throws ParseException;
}
