class Book {
    String title;
    Book(String title) {
        this.title = title;
    }
}
class Library{
    String name;
    Book book;
    Library(String name, Book book) {
        this.name = name;
        this.book = book;
    }
    void display() {
        System.out.println("Library: " + name + ", Book: " + book.title);
    }
}
class Main2 {
    public static void main(String[] args) {
        Book b = new Book("Java Programming");
        Library lib = new Library("City Library", b);
        lib.display();
    }
}
