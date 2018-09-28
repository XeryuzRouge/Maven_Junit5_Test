
package com.mycompany.app;

import java.io.*;

public class FizzBuzz {

  public void oneToHundred() {

    for(int i=1; i<=100; i++) {
    String j = "";
      if (i % 3 != 0 && i % 5 != 0) {
        j = Integer.toString(i);
      }
      else {
        if (i % 3 == 0) {
          j += "Fizz";
        }
        if (i % 5 == 0) {
          j += "Buzz";
        }
      }
      System.out.print(j);
      if (i<100){
        System.out.print(", ");
      }
    }
  }

}