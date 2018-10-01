package com.mycompany.app;

import java.io.*;
import java.util.*;

public class ArraysZipper {

   public String[] zipThese(String[] firstList, String[] secondList, String[] priorityValues) {
    String[] listToReturn = firstList;
    for(int i = 0;i < firstList.length; i++) {
      if (firstList[i] != secondList[i]) {
        for (int j = 0;j < priorityValues.length; j++) {
          if (secondList[i] == priorityValues[j]) {
            listToReturn[i] = listToReturn[i] + secondList[i];
          }
        }
      }
    }
    return listToReturn;
  }    
}