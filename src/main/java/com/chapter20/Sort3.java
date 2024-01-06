package com.chapter20;

import com.chapter20.time.Time2;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Sort3 {
  public static void main(String[] args) {
    List<Time2> list = new ArrayList<Time2>();

    list.add(new Time2(6, 24, 34));
    list.add(new Time2(18, 14, 58));
    list.add(new Time2(6, 5, 34));
    list.add(new Time2(12, 14, 58));

    System.out.println("Unsorted array of time: " + list);

    Collections.sort(list, new TimeComparator());

    System.out.println("Sorted array of time: " + list);
  }
}
