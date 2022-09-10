package ch01.iterator;

interface Aggregate {
    Iterator iterator();
}
class BookShelf implements Aggregate{
    private static int MAX_BOOKS = 100;
    private Book[] books = new Book[MAX_BOOKS];
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