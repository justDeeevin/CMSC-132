package org.cmsc132.week1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class Sheet1Test {
  @Test
  void removeAll() {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 9));
    Sheet1.removeAll(list, 5);
    assertArrayEquals(list.toArray(), new Integer[] {3, 1, 4, 1, 9, 2, 6, 3, 9, 0, 0, 0});
  }

  @Test
  void findPos() {
    assertEquals(Sheet1.findPos(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 1}, 3), 6);
  }
}
