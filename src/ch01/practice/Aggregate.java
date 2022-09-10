package ch01.practice;

import java.util.Arrays;

interface Aggregate {
    Iterator iterator();
}

class BookShelf implements Aggregate{
    private static int INITIAL_COUNT = 1;
    private Book[] books = new Book[INITIAL_COUNT];
    private int index = 0;
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
    public int size() {
        return books.length;
    }
    public void appendBook(Book book){
        this.books[index] = book;
        index++;
        if(index >= books.length){
            System.out.println("# copy arr...");
            Book[] newArr = new Book[books.length * 2];
            System.arraycopy(books, 0, newArr, 0, index);
            books = newArr;
        }
    }
    public Book getBook(int index){
        return books[index];
    }
}

class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}