package inclassCoding.W6D5.Funiture;

public class VictorianFunitureFactory implements FunitureFactory {
  // @Override
  // public Chair createChair() {
  // // return new ModernCHair();
  // switch(style) {
  // case MODERN -> new ModernChair();
  // case VICTORIAN -> new VictorianChair();
  // };
  // return chair;
  // }

  // @Override
  // public Sofa createSofa(Style style){
  // Sofa sofa = switch (style) {
  // case MODERN -> new ModernSofa();
  // case VICTORIAN -> new VictorianSofa();
  // };
  // return sofa;
  // }

  @Override
  public Chair createChair() {
    return new VictorianChair();
  }

  @Override
  public Sofa createSofa() {
    return new VictorianSofa();
  }

  public static void main(String[] args) {
    VictorianFunitureFactory vFactory = new VictorianFunitureFactory();
    Chair chair = vFactory.createChair();
  }
}
