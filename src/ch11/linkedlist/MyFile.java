package ch11.linkedlist;

class MyFile implements Entry {
    private final String fileName;
    private Entry parent;

    MyFile(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void print(int depth) {
        for (int i = 0; i < depth ; i++){
            System.out.print("ㅡ");
        }
        System.out.print(" ");
        System.out.println(fileName);
    }

    @Override
    public void printFullPath(String prev) {
        String fullPath = prev + "/" + this.fileName;
        for(Entry start = this ; start.parent()!=null; start=start.parent()){
            printFullPath(fullPath);
        }
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
