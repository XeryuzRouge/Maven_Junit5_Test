package com.mycompany.app;

import java.util.*;

public class FizzBuzzKata {

  public void oneToHundred(){
    ListGenerator listGenerator = new ListGenerator();
    int[] generatedList = listGenerator.generate(100);

    MultiplierIdentifier multiplierIdentifier = new MultiplierIdentifier();
    int[] multipliersOf3 = multiplierIdentifier.getMultipliersOf(3, generatedList);
    int[] multipliersOf5 = multiplierIdentifier.getMultipliersOf(5, generatedList);

    ValuesExchanger valuesExchanger = new ValuesExchanger();
    String[] fizzList = valuesExchanger.numbersToStrings("Fizz", multipliersOf3, generatedList);
    String[] buzzList = valuesExchanger.numbersToStrings("Buzz", multipliersOf5, generatedList);

    ElementsZipper elementsZipper = new ElementsZipper();
    String[] priorityValues = {"Fizz", "Buzz"};
    String[] results = elementsZipper.zipThese(fizzList, buzzList, priorityValues);

    Printer printer = new Printer();
    String resultsAsString = Arrays.toString(results);
    printer.show(resultsAsString);
  }

}