package ch11.fullpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

class MyDir implements Entry {
    private List<Entry> entries = new ArrayList<>();
    private final String dirName;

    MyDir(String dirName) {
        this.dirName = dirName;
    }
    public void addEntries(Entry...list){
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

    @Override
    public void printFull(String prevPath) {
        String fullPath = prevPath +"/"+ dirName.toUpperCase(Locale.ROOT);
        System.out.print(" ");
        System.out.println(fullPath);
        for (Entry entry : entries) {
            entry.printFull(fullPath);
        }
    }

}
