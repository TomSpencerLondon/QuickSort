package com.tomspencerlondon.sort;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class SortTest {

  @Test
  void testSort() {
    assertEquals(asList(), sort(asList()));
    assertEquals(asList(1), sort(asList(1)));
    assertEquals(asList(1, 2), sort(asList(1, 2)));
    assertEquals(asList(1, 2), sort(asList(2, 1)));
    assertEquals(asList(1, 2, 3), sort(asList(1, 2, 3)));
    assertEquals(asList(1, 2, 3), sort(asList(2, 1, 3)));
    assertEquals(asList(1, 2, 3), sort(asList(1, 3, 2)));
    assertEquals(asList(1, 2, 3), sort(asList(3, 2, 1)));
    assertEquals(asList(1, 2, 3, 4), sort(asList(1,2, 3, 4)));
    assertEquals(asList(1, 2, 3, 4, 5), sort(asList(1,2,5, 3, 4)));
    assertEquals(asList(1, 1, 2, 3), sort(asList(1, 3, 1, 2)));
  }

  private List<Integer> sort(List<Integer> list) {
    if (list.size() <= 1) {
      return list;
    } else {
      int middle = list.get(0);
      List<Integer> middles = list.stream().filter(x -> x == middle).collect(Collectors.toList());
      List<Integer> lessers = list.stream().filter(x -> x < middle).collect(Collectors.toList());
      List<Integer> greaters = list.stream().filter(x -> x > middle).collect(Collectors.toList());
      List<Integer> result = new ArrayList<>();
      result.addAll(sort(lessers));
      result.addAll(middles);
      result.addAll(sort(greaters));
      return result;
    }
  }
}
