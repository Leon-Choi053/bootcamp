package inclassCoding.W5D5;

public class Zoo<T> {
  T animal;

  // Constructor
  private Zoo(T animal) {
    this.animal = animal;
  }

  // Zoo<T> -> return Type
  // T -> input paremeter
  // <T extends Animal> -> the range of T of the method
  public static<T extends Animal> Zoo<T> of(T animal) {
    return new Zoo<>(animal);
  }

  public T getAnimal() {
    return this.animal;
  }

  public void setAnimal(T animal){
    this.animal = animal;
  }
}
