package ch11.fullpath;

class MyFile implements Entry {
    private final String fileName;

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
    public void printFull(String prevPath) {
        String fullPath = prevPath +"/"+ fileName;
        System.out.print(" ");
        System.out.println(fullPath);
    }
}
