package ch11.composite;

import java.util.*;

class MyDir implements Entry{
    private List<Entry> entries = new ArrayList<>();
    private final String dirName;

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
        System.out.println(dirName.toUpperCase(Locale.ROOT));
        for (Entry entry : entries) {
            entry.print(depth);
        }
    }

}
