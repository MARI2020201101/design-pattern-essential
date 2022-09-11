package ch13.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

class MyDir implements Entry {
    List<Entry> entries = new ArrayList<>();
    final String dirName;

    MyDir(String dirName) {
        this.dirName = dirName;
    }
    public void addEntries(Entry...list){
        Collections.addAll(entries, list);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
