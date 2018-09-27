
package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.io.*;

class FizzBuzzTests {

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  @BeforeEach
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
  }

  @AfterEach
  public void restoreStreams() {
    System.setOut(originalOut);
  }

@Test
public void one_to_hundred() {
    FizzBuzz fizzbuzz = new FizzBuzz();
    fizzbuzz.one_to_hundred();
    String list = "";
    
    for(int i=0; i<=100; i++){
      String j = "";
      if(i % 3 != 0 && i % 5 != 0){
        j = Integer.toString(i);
      }
      else{
        if(i % 3 == 0){
          j += "fizz";
        }
        if(i % 5 == 0){
          j += "Buzz";
        }
      }
      list += j + ", ";
    }

    assertEquals(list, outContent.toString());
}
}