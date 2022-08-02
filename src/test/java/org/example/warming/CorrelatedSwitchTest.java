package org.example.warming;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.math.BigInteger;
import java.util.Random;
import org.junit.jupiter.api.Test;

/**
 * The type Correlated switch test.
 */
class CorrelatedSwitchTest {

  /**
   * Test 0.
   */
  @Test
  void test0() {
    CorrelatedSwitch correlatedSwitch = new CorrelatedSwitch();
    char[] firstState = new char[]{'1', '1', '1', '0', '0', '1', '1', '1', '0', '0', '0'};
    char[] expectedfinalState = new char[]{'0', '1', '1', '0', '0', '1', '0', '1', '1', '0', '1'};
    System.out.print("state 0: ");
    System.out.println(firstState);
    char[] finalState = correlatedSwitch.apply(firstState);
    System.out.println(finalState);
    assertArrayEquals(expectedfinalState, finalState);
  }

  /**
   * Test optim.
   */
  @Test
  void testOptim() {
    CorrelatedSwitch correlatedSwitch = new CorrelatedSwitch();

    BigInteger bigState = new BigInteger(100, new Random(20));
    char[] randomState = bigState.toString(2).toCharArray();
    BigInteger expectedRandomState = new BigInteger("888346013862469159339194496211");
    System.out.print("state 0: ");
    System.out.println(randomState);
    char[] finalState = correlatedSwitch.apply(randomState);
    System.out.print("state 1: ");
    System.out.println(finalState);
    System.out.println(new BigInteger(
        "1011001101100110011010011001100100110110110100100101100110100101100100110110100101101011010011010011",
        2).toString());
    assertArrayEquals(expectedRandomState.toString(2).toCharArray(), finalState);
  }


  /**
   * Test optim 2.
   */
  @Test
  void testOptim2() {
    CorrelatedSwitch correlatedSwitch = new CorrelatedSwitch();

    BigInteger bigState = new BigInteger(50, new Random(20));
    char[] randomState = bigState.toString(2).toCharArray();
    BigInteger expectedRandomState = new BigInteger("904239221271845");

    System.out.print("state 0: ");
    System.out.println(randomState);
    char[] finalState = correlatedSwitch.apply(randomState);
    System.out.print("state 1: ");
    System.out.println(finalState);
    System.out.println(new BigInteger(new String(finalState), 2).toString());

    assertArrayEquals(expectedRandomState.toString(2).toCharArray(), finalState);
  }
}