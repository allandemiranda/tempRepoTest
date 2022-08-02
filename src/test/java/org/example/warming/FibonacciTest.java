package org.example.warming;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Random;
import org.junit.jupiter.api.Test;

/**
 * The type Fibonacci test.
 */
class FibonacciTest {

  /**
   * Fib.
   */
  @Test
  void fib() {
    long[] fibonacciList = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
    long[] imputList = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    for (int i = 0; i < fibonacciList.length; i++) {
      assertEquals(fibonacciList[i], Fibonacci.fib(imputList[i]));
    }
  }

  /**
   * Fib.
   */
  @Test
  void fibEx() {
    assertThrows(IllegalArgumentException.class, () -> Fibonacci.fib(((int) (Math.random() * (1 + 10) - 10))));
  }
}