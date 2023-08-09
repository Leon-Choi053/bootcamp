package inclassCoding.W5D3;

public enum Color {
  RED(1),
  BLUE(2),
  GREEN(3),
  BLACK(4),
  ;

  int id;

  private Color(int id){
    this.id = id;
  }
}
