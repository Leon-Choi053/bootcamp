package inclassCoding.W6D3;

import java.util.function.Function;

public class LengthFunc implements Function<String, Integer>{
  @Override
  public Integer apply(String str) {
    return str.length();
  }
  
}
