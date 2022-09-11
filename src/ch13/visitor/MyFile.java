package ch13.visitor;

class MyFile implements Entry {
    final String fileName;

    MyFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
