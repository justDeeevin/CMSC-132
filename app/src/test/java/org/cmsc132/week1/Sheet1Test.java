package org.cmsc132.week1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class Sheet1Test {
  @Test
  void shee1() {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 9));
    Sheet1.removeAll(list, 5);
    assertArrayEquals(list.toArray(), new Integer[] {3, 1, 4, 1, 9, 2, 6, 3, 9, 0, 0, 0});
  }
}
