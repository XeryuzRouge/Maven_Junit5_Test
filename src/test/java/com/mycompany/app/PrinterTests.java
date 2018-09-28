
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

  @BeforeEach public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
  }

  @AfterEach public void restoreStreams() {
    System.setOut(originalOut);
  }

  @Test public void Printer_getWhatItPrints() {
    Printer printer = new Printer();
    String expectToPrint = "something";

    printer.show(expectToPrint);

    assertEquals(expectToPrint, outContent.toString());
  }

}