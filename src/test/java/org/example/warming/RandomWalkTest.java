package org.example.warming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Point;
import org.junit.jupiter.api.Test;

/**
 * The type Random walk test.
 */
class RandomWalkTest {

  /**
   * Test 0.
   */
  @Test
  void test0() {
    RandomWalk randomWalk = new RandomWalk();
    assertEquals(new Point(0, 0),
        randomWalk.apply(new Point(0, 0), new char[]{'L', 'U', 'U', 'R', 'R', 'R', 'D', 'D', 'D', 'L', 'L', 'U'}));
  }

  /**
   * Test max.
   */
  @Test
  void testMax() {
    RandomWalk randomWalk = new RandomWalk();
    assertEquals(2,
        randomWalk.max(new Point(0, 0), new char[]{'L', 'U', 'U', 'R', 'R', 'R', 'D', 'D', 'D', 'L', 'L', 'U'}));
  }


  /**
   * Test min.
   */
  @Test
  void testMin() {
    RandomWalk randomWalk = new RandomWalk();
    assertEquals(-1,
        randomWalk.min(new Point(0, 0), new char[]{'L', 'U', 'U', 'R', 'R', 'R', 'D', 'D', 'D', 'L', 'L', 'U'}));
  }
}