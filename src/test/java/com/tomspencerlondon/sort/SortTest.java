package com.tomspencerlondon.sort;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

public class SortTest {

  @Test
  void testSort() {
    assertEquals(asList(), sort(asList()));
    assertEquals(asList(1), sort(asList(1)));
  }

  private List<Integer> sort(List<Integer> list) {
    return list;
  }
}
