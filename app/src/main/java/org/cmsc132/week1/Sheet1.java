package org.cmsc132.week1;

import java.util.ArrayList;

public class Sheet1 {
  /**
   * Removes all instances of the given value from the list, shifting all other values to the left
   * and leaving trailing values as 0.
   *
   * <p>Example input: [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 9]
   *
   * <p>Example modified list: [3, 1, 4, 1, 9, 2, 6, 3, 9, 0, 0, 0]
   */
  public static void removeAll(ArrayList<Integer> list, int toRemove) {
    int shiftWidth = 0;

    for (int i = 0; i < list.size(); i++) {
      while (i + shiftWidth < list.size() && list.get(i + shiftWidth) == toRemove) shiftWidth++;

      if (i + shiftWidth < list.size()) list.set(i, list.get(i + shiftWidth));
      else list.set(i, 0);
    }
  }

  public static int findPos(int[] arr, int eltToFind) {
    int out = -1;
    for (int i = 0; i < arr.length; i++) if (arr[i] == eltToFind) out = i;
    return out;
  }
}
