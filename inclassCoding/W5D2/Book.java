package inclassCoding.W5D2;

public class Book {
  String author;
  String name;

  public Book(String author, String name) {
    this.author = author;
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public String getAuthor() {
    return this.author;
  }

  @Override
  public String toString(){
    return "[" + this.author+ ", " + this.name + "]";
  }
}
