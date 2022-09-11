package ch11.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

class MyDir implements Entry {
    private List<Entry> entries = new ArrayList<>();
    private final String dirName;
    private Entry parent;

    MyDir(String dirName) {
        this.dirName = dirName;
        this.parent = this;
    }
    public void addEntries(Entry...list){
        Collections.addAll(entries, list);
        for(Entry entry : list){
            entry.parent(this);
            entries.add(entry);
        }
    }
    @Override
    public void print(int depth) {
        ++depth;
        for (int i = 0; i < depth ; i++){
            System.out.print("ㅡ");
        }
        System.out.print(" ");
        System.out.println(dirName.toUpperCase(Locale.ROOT));
        for (Entry entry : entries) {
            entry.print(depth);
        }
    }

    @Override
    public void printFullPath(String prev) {
        String fullPath = prev + "/" + this.dirName;
//        for(Entry start = this ; start.parent()!=null; start=start.parent()){
//            printFullPath(fullPath);
//
//        }
        System.out.println(fullPath);
    }

    @Override
    public void parent(Entry parent) {
        this.parent = parent;
    }

    @Override
    public Entry parent() {
        return parent;
    }


}
