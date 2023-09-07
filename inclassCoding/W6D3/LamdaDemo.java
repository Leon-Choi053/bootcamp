package inclassCoding.W6D3;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class LamdaDemo {
  public static void main(String[] args) {
    Function<String, Integer> lengthFunction = str -> str.length();
    Function<String, Character> firstCharFunction = str -> str.charAt(2);

    System.out.println(lengthFunction.apply("abcd")); // length = 4
    System.out.println(firstCharFunction.apply("month"));

    LengthFunc lengthFunc = new LengthFunc();
    System.out.println(lengthFunc.apply("def"));

    Map<String, String> map = new HashMap<>();
    map.put("abc", "Mary");
    // Function<String, String> formula = s -> "defult";
    String result = map.computeIfAbsent("dse", s -> "defult");
    System.out.println(result); // abc -> Mary, def/xyz(not abc) -> defult
    System.out.println(map.size()); // abc -> 1, not abc -> 2

    BiFunction<Integer, Integer, BigDecimal> addtion =
        (x, y) -> BigDecimal.valueOf(x + y);
    System.out.println(addtion.apply(-4, 3).abs());

    Map<String, Integer> stock = new HashMap<>();
    stock.put("clothes", 100); // 100 is price

    stock.compute("clothes",(item, oldPrice) -> (int) (oldPrice - oldPrice * 0.1));
    System.out.println(stock.get("clothes")); // 90

    // new value: null, remove item
    stock.compute("clothes", (item, oldPrice) -> null);
    System.out.println(stock.size()); // 0

    //
    stock.compute("shoes", (item, oldPrice) -> 120);
    System.out.println(stock.get("shoes"));

    // map.compute("bcde", (s1, s2) -> "value");
    // System.out.println(map.size()); // 3
    // map.compute("bcde", (s1, s2)->"anthot value");
    // System.out.println(map.size()); // 3
    // System.out.println(map.get("bcde")); // anthot value

    // map.compute("bcde", (s1, s2) -> null);
    // System.out.println(map.size()); // 2

  }
}
