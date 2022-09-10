package ch01.practice;

class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("자바언어로 배우는 디자인패턴 입문"));
        bookShelf.appendBook(new Book("자바언어로 배우는 디자인패턴 멀티쓰레드편"));
        bookShelf.appendBook(new Book("더 코드"));
        bookShelf.appendBook(new Book("프로그래머 수학으로 생각하라"));
        Iterator iterator = bookShelf.iterator();
        while(iterator.hasNext()){
            Book book =(Book) iterator.next();
            System.out.println(book);
        }
    }
}
