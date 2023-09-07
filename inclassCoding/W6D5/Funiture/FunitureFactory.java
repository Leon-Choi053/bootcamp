package inclassCoding.W6D5.Funiture;

public interface FunitureFactory {
  Chair createChair();

  Sofa createSofa();

  public static void main(String[] args) {
    int b = 4;
    Style style = null;
    if (b < 10) {
      style = Style.MODERN;
    }else if(b < 3) {
      style = Style.VICTORIAN;
    }
    FunitureFactory factory = FunitureFactory.createFactory(Style.MODERN);
    int a = 200;
    Funiture funiture = null;
    if (a > 200) { // buniess logic
      factory.createChair();
    }else {

    }
  }

  static FunitureFactory createFactory(Style style) {
    FunitureFactory factory = switch (style) {
      case MODERN -> new ModernFunituryFactory();
      case VICTORIAN -> new VictorianFunitureFactory();
    };
    return factory;
  }

  static Chair createChair(Style style) {
    Chair chair = switch (style) {
      case MODERN -> new ModernChair();
      case VICTORIAN -> new VictorianChair();
    };
    return chair;
  }

  static Sofa createSofa(Style style) {
    Sofa sofa = switch (style) {
      case MODERN -> new ModernSofa();
      case VICTORIAN -> new VictorianSofa();
    };
    return sofa;
  }


}
