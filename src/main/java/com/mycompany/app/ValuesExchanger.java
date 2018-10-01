package com.mycompany.app;

import java.util.*;

public class ValuesExchanger {

  public String[] numbersToStrings(String newValue, int[] elementsToChange, int[] entireList){
    String[] listToReturn = Arrays.toString(entireList).split("[\\[\\]]")[1].split(", ");
    for(int i = 0;i < entireList.length; i++) {
      for(int j = 0;j < elementsToChange.length; j++)
        if (entireList[i] == elementsToChange[j]){
          listToReturn[i] = newValue;
        }
    }
  return listToReturn;
  }

}