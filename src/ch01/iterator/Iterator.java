package ch01.iterator;

interface Iterator {
    boolean hasNext();
    Object next();
}
class BookShelfIterator implements Iterator{

    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return (index < bookShelf.size()) && bookShelf.getBook(index) != null;
    }

    @Override
    public Book next() {
        Book book = bookShelf.getBook(index);
        index++;
        return book;
    }
}
