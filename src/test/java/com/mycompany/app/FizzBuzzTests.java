
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

    list = "fizzBuzz, 1, 2, fizz, 4, Buzz, fizz, 7, 8, fizz, Buzz, " +
    "11, fizz, 13, 14, fizzBuzz, 16, 17, fizz, 19, Buzz, " +
    "fizz, 22, 23, fizz, Buzz, 26, fizz, 28, 29, fizzBuzz, " +
    "31, 32, fizz, 34, Buzz, fizz, 37, 38, fizz, Buzz, " +
    "41, fizz, 43, 44, fizzBuzz, 46, 47, fizz, 49, Buzz, " +
    "fizz, 52, 53, fizz, Buzz, 56, fizz, 58, 59, fizzBuzz, " +
    "61, 62, fizz, 64, Buzz, fizz, 67, 68, fizz, Buzz, " +
    "71, fizz, 73, 74, fizzBuzz, 76, 77, fizz, 79, Buzz, " +
    "fizz, 82, 83, fizz, Buzz, 86, fizz, 88, 89, fizzBuzz, " +
    "91, 92, fizz, 94, Buzz, fizz, 97, 98, fizz, Buzz";

    assertEquals(list, outContent.toString());
}
}