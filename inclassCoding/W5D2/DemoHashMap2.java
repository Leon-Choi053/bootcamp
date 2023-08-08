package inclassCoding.W5D2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DemoHashMap2 {
  public static void main(String[] args) {
    HashMap<Integer, Book> books = new HashMap<>();
    // key = Address of Byte or value of Byte?
    books.put(Integer.valueOf(128), new Book("Dummy", "Eric"));
    books.put(Integer.valueOf(128), new Book("Dummy", "Steve"));
    System.out.println(books.size());

    HashMap<Author, Book> bookMap = new HashMap<>();
    // Author unique key?
    Author author1 = new Author("John", 30);
    Author author2 = new Author("John", 29);
    bookMap.put(author1, new Book("Dummy", "Book3"));
    bookMap.put(author2, new Book("Dummy", "Book4"));
    System.out.println(bookMap.size());

    HashMap<Author, ArrayList<Book>> bookMap2 = new HashMap<>();
    ArrayList<Book> booklList1 = new ArrayList<>();
    booklList1.add(new Book("Dummy", "Book1"));
    booklList1.add(new Book("Dummy", "Book2"));
    ArrayList<Book> booklList2 = new ArrayList<>();
    booklList2.add(new Book("Dummy", "Book3"));
    booklList2.add(new Book("Dummy", "Book4"));

    bookMap2.put(author1, booklList1);

    bookMap2.put(author2, booklList2);

    for (Map.Entry<Author, ArrayList<Book>> author : bookMap2.entrySet()) {
      // System.out.println(author.getKey().name);
      for(Book book : author.getValue()){
        System.out.println("Author name: " + author.getKey().name + "Book Name: " + book.getName());
      }
    }
  }
}
