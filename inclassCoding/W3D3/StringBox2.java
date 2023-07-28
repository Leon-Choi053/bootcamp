package inclassCoding.W3D3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringBox2 {


    public StringBox2(){
   
  }
  
  char[] string;
  public StringBox2 append(String s) { // hello -> helloworld
    char[] res = new char[this.string.length +s.length()];
    int idx =0;
    int j=0;
    while (j<this.string.length){
      res[idx]=this.string[j];
      idx++;
      j++;
    }
    j=0;
    while(j<s.length()){
      res[idx]=s.charAt(j);
    }
    return null;
  }


  public StringBox2(char[] sources){
    //this.string = new char[string.length]; // new object
    this.string = Arrays.copyOf(sources, sources.length);
  }

  public String toString(){
    return Arrays.toString(this.string);
  }

  public static void main(String[] args) {
    char[] chars = new char[] {'a', 'c', 'b'};
    
    StringBox2 box = new StringBox2(chars);
    System.out.println(box.toString());

    chars[1] = 'x';
    System.out.println(Arrays.toString(chars));
    System.out.println(box.toString());
  }
}
