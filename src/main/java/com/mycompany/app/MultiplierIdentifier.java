package com.mycompany.app;

import java.util.*;

public class MultiplierIdentifier {

  public int[] getMultipliersOf(int multiplier, int[] listToCheck) {
    List<Integer> listToReturn = new ArrayList<Integer>();
    for(int i = 0;i < listToCheck.length; i++) {
      if(listToCheck[i] % multiplier == 0) {
        listToReturn.add(listToCheck[i]);
      }
    }

    return listToReturn.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();
  }
  
}