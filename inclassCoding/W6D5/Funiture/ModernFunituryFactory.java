package inclassCoding.W6D5.Funiture;

public class ModernFunituryFactory implements FunitureFactory{
  @Override
  public Chair createChair() {
    return new ModernChair();
  }

  @Override
  public Sofa createSofa() {
    return new ModernSofa();
  }
}
