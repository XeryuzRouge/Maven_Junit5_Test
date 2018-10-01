
package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.*;
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

  @Test public void ListGenerator_getWhatItGenerates() {
    ListGenerator listGenerator = new ListGenerator();
    int[] expectedList = {1, 2, 3};
    int[] generatedList = listGenerator.generate(3);
    assertArrayEquals(expectedList, generatedList);
  }

  @Test public void MultiplierIdentifier_getMultipliers() {
    MultiplierIdentifier multiplierIdentifier = new MultiplierIdentifier();
    int[] exampleList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    int multipliersOf = 3;
    int[] results = multiplierIdentifier.getMultipliersOf(multipliersOf, exampleList);

    int[] expectedNumbers = {3, 6, 9, 12};
    assertArrayEquals(expectedNumbers, results);
  }

}