package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Random random = new Random();
    List<Integer> intList = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      intList.add(random.nextInt(9) + 1);
    }
    System.out.println(intList);
    int maxValue = intList.get(0);
    Iterator iterator = intList.iterator();
    while (iterator.hasNext()) {
      if (((Integer) iterator.next() > maxValue)) {
        maxValue = (Integer) iterator.next();
      }
    }
    System.out.println(maxValue);
  }
}
