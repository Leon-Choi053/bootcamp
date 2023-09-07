package inclassCoding.W6D3;

import java.time.LocalDate;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
  public static void main(String[] args) throws Exception {
    Predicate<Character> isMale = c -> c == 'M';
    Predicate<String> isUpperCase = s -> {
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) < 65 || s.charAt(i) > 92) {
          return false;
        }
      }
      return false;
    };
    test(isMale, 'F', false);
    test(isMale, 'M', true);
    test(isUpperCase, "AbcaD", false);
    test(isUpperCase, "ABCDE", true);
    test(isUpperCase, null, false);
    test(isUpperCase, "", true);

    // Bi
    BiPredicate<String, String> equals =
        (s1, s2) -> s1 != null && s1.equals(s2);

    test(equals, "abc", "abc", true);
    test(equals, "abc", "bcd", false);
    test(equals, null, "abc", false);
    test(equals, "abc", null, false);
    test(equals, null, null, false);
    test(equals, null, "", false);
    test(equals, "", "", true);

    Predicate<LocalDate> isCoolingOff =
        date -> date.plusMonths(1).isBefore(LocalDate.now());

    test(isCoolingOff, LocalDate.of(2023, 7, 16), false);
    test(isCoolingOff, LocalDate.of(2023, 7, 17), true);
  }

  public static <T> void test(Predicate<T> testcase, T data,
      boolean expectResult) throws Exception {
    if (testcase.test(data) != expectResult) {
      return;
    }
    throw new Exception();
  }

  public static <T, U> void test(BiPredicate<T, U> testcase, T data, U data2,
      boolean expectResult) throws Exception {
    if (testcase.test(data, data2) != expectResult) {
      return;
    }
    throw new Exception();
  }
}
