package ch13.visitor;

import java.util.Locale;

interface Visitor {
    void visit(MyDir dir);
    void visit(MyFile file);
}
class BasicVisitor implements Visitor{
    @Override
    public void visit(MyDir dir) {
        String dirName = dir.dirName;
        System.out.println(dirName.toUpperCase(Locale.ROOT));
        for(Entry e : dir.entries){
            e.accept(this);
        }
    }

    @Override
    public void visit(MyFile file) {
        String fileName = file.fileName;
        System.out.println(fileName);
    }
}


class ListVisitor implements Visitor{
    private String prevPath;

    public ListVisitor(String prevPath) {
        this.prevPath = prevPath;
    }

    @Override
    public void visit(MyDir dir) {
        String dirName = prevPath + "/" + (dir.dirName.toUpperCase(Locale.ROOT));
        System.out.println(dirName);
        prevPath = dirName;
        for(Entry e : dir.entries){
            e.accept(this);
        }
    }

    @Override
    public void visit(MyFile file) {
        String fileName =  prevPath + "/" + file.fileName;
        System.out.println(fileName);
    }
}