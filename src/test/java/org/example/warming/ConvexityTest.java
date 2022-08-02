package org.example.warming;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * The type Convexity test.
 */
class ConvexityTest {

  /**
   * Test 0.
   */
  @Test
  void test0() {
    Convexity convexity = new Convexity();
    assertTrue(convexity.isConvex(new double[10]));
  }

  /**
   * Test 1.
   */
  @Test
  void test1() {
    Convexity convexity = new Convexity();
    assertTrue(convexity.isConvex(new double[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
  }

  /**
   * Test 2.
   */
  @Test
  void test2() {
    Convexity convexity = new Convexity();
    assertTrue(convexity.isConvex(new double[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
  }

  /**
   * Test 3.
   */
  @Test
  void test3() {
    Convexity convexity = new Convexity();
    assertTrue(convexity.isConvex(new double[]{9, 7, 5, 3, 1, 0, 2, 4, 6, 8}));
  }

  /**
   * Test 4.
   */
  @Test
  void test4() {
    Convexity convexity = new Convexity();
    assertFalse(convexity.isConvex(new double[]{9, 7, 5, 6, 8, 7, 5, 4, 6, 8}));
  }
}