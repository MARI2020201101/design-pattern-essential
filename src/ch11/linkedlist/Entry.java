package ch11.linkedlist;

interface Entry {
    void print(int depth);
    void printFullPath(String prev);
    void parent(Entry parent);
    Entry parent();
}
