package ch11.composite;

class Demo {
    public static void main(String[] args) {
        MyDir root = new MyDir("root");
        MyDir document = new MyDir("document");
        MyDir works = new MyDir("works");
        MyDir image = new MyDir("image");
        MyFile file1 = new MyFile("file.1");
        MyFile file2 = new MyFile("file.2");
        MyFile file3 = new MyFile("file.3");
        MyFile file4 = new MyFile("file.4");
        MyFile file5 = new MyFile("file.5");
        image.addEntries(file1,file2,file3,file4,file5);

        works.addEntries(file1,file2,file3);

        document.addEntries(file1,file3,file5);

        works.addEntries(image);
        document.addEntries(works);
        root.addEntries(document);

        root.print(0);

    }
}
