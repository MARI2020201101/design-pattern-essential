package ch11.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class MyDir implements Entry{

    List<Entry> entries = new ArrayList<>();
    private final String dirName;
    private int depth;

    MyDir(String dirName) {
        this.dirName = dirName;
//        entries.add(this);
    }
    public void addEntries(Entry ...list){
        Collections.addAll(entries, list);
    }
    @Override
    public void print(int depth) {
        ++depth;
        for (int i = 0; i < depth ; i++){
            System.out.print("ㅡ");
        }
        System.out.print(" ");
        System.out.println(dirName);
        Iterator<Entry> it = entries.iterator();
        while(it.hasNext()){
            Entry entry = it.next();
            entry.print(depth);
        }

    }

}
