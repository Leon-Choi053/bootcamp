package inclassCoding.W5D2;

import java.util.HashMap;
import java.util.Map;

public class DemonHashMap {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    // <String , String> -> <key, value>
    map.put("abc", "hello world"); // entry
    map.put("bcd", "I am Developer"); // entry
    System.out.println(map.size());
    // Map.Entry -> Key + Value

    // if duplicated (hashcode(), equals()), override the entry
    map.put("abc", "hello world!!"); // Override the entry with key "abc"
    System.out.println(map.get("abc")); // hello world!!
    System.out.println(map.size());

    System.out.println(map.isEmpty());
    System.out.println(map.toString());
    System.out.println(map);

    System.out.println(map.containsKey("abc"));
    System.out.println(map.containsValue("I am Developer"));

    if (!map.containsKey("abc")) {
      return;
    }

    for (Map.Entry<String, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }

    for (String key : map.keySet()) {
      System.out.println(key);
    }

    for (String value : map.values()) {
      System.out.println(value);
    }

    System.out.println(map.remove("abc")); // hello world!!
    System.out.println(map.remove("bcd", "I am not Developer")); // false
    System.out.println(map.remove("bcd", "I am Developer")); // true
  }
}
