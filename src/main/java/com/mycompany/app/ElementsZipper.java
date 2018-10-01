package com.mycompany.app;

import java.util.*;

public class ElementsZipper {

   public String[] zipThese(String[] firstList, String[] secondList, String[] priorityValues) {
    List<String> zippedList = new ArrayList<String>();
    for(int i = 0;i < firstList.length; i++) {
      String newElement = "";
      if (!firstList[i].equals(secondList[i])) {
        for (int j = 0;j < priorityValues.length; j++) {
          if (firstList[i].equals(priorityValues[j])) {
            newElement = newElement + firstList[i];
          }
          if (secondList[i].equals(priorityValues[j])) {
            newElement = newElement + secondList[i];
          }
        }
      }
      else  {
        newElement = firstList[i];
      }
      zippedList.add(newElement);
    }
    String[] arrayToReturn = new String[zippedList.size()];
    arrayToReturn = zippedList.toArray(arrayToReturn); 

    return arrayToReturn;
  }    
  
}