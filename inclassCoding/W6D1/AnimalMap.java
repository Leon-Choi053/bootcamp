package inclassCoding.W6D1;

import java.util.Map;

public class AnimalMap<T> { // java 17 remove this feature
  Map<T, String> map;

  public AnimalMap() {

  }

  public void put(T key, String animal){
    map.put(key, animal);
  }


  public static void main(String[] args) {
    AnimalMap<String> map1 = new AnimalMap<>();
    map1.put("abc", "dog");

    AnimalMap<Integer> map2 = new AnimalMap<>();
    map2.put(1, "dog");
  }
}


