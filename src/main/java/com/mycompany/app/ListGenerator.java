
package com.mycompany.app;

public class ListGenerator {

  public int[] generate(int elements) {
    int[] returningList = new int[elements];
    for (int i = 0; i < elements; i++){
      returningList[i] = i + 1;
    }
    return returningList;
  }
  
}