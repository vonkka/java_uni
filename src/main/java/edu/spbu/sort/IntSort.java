package edu.spbu.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntSort {
  private static void swap(int array[], int j, int i) {
    if (i != j) {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }
  }
  private static int partition(int array[], int beg, int end) {
    int partElem = array[end];
    int j = beg;
    for (int i = beg; i <= end; ++i) {
      if (array[i] < partElem) swap(array, i, j++);
    }
    swap(array, j, end);
    return j;
  }

  private static void quickSort(int array[], int beg, int end) {
    if (beg < end) {
      int partElem = partition(array, beg, end);
      quickSort(array, beg, partElem - 1);
      quickSort(array, partElem + 1, end);
    }
  }
  public static void sort(int array[]) {
    quickSort(array, 0, array.length - 1);
  }

  public static void sort (List<Integer> list) {
    Collections.sort(list);
  }
}
