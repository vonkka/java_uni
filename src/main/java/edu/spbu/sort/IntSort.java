package edu.spbu.sort;
import java.util.Random;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntSort {
  public static int avg(int a, int b, int c) {
    if (a > b) return b > c ? b : Math.min(a, c);
    else if (a > c) return a;
    return c;
  }
  public static void swap(int[] array, int j, int i) {
    if (i != j) {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }
  }

  public static int partition(int[] array, int beg, int end) {
    int pivot = avg(array[beg], array[(end + beg) / 2], array[end]);
    int i = beg;
    for (int j = beg; j <= end; ++j) {
      if (array[j] < pivot) {
        swap(array, i++, j);
      }
    }
    for (int k = end; k > i; --k) {
      if (array[k] == pivot) {
        swap(array, k, i);
        break;
      }
    }
    return i;
  }

  public static void quickSort(int[] array, int beg, int end) {
    if (beg < end) {
      int ind = partition(array, beg, end);
      quickSort(array, beg, ind - 1);
      quickSort(array, ind + 1, end);
    }
  }
  public static void sort(int[] array) {
    quickSort(array, 0, array.length - 1);
  }

  public static void sort (List<Integer> list) {
    Collections.sort(list);
  }
}
