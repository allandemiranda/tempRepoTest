package org.example.warming;

/**
 * 4. CorrelatedSwitch
 */
public class CorrelatedSwitch {
  /**
   Correlated switch is like a game which has a simple rule:
   Each time we have 3 switches which have the same state,
   we change the state of the first and third switch.

   000 -> becomes 101
   111 -> becomes 010

   implement a method which applies this rule to equilibrium.
   example:
   initial state:  1 1 0 0 1 1 1 0 0
   | | |
   iter1-          1 1 0 0 0 1 0 0 0
   | | |
   iter2-          1 1 1 0 1 1 0 0 0
   | | |
   iter3-          0 1 0 0 1 1 0 0 0
   | | |
   iter4-          0 1 0 0 1 1 1 0 1
   | | |
   iter5-          0 1 0 0 0 1 0 0 1
   | | |
   iter6-          0 1 1 0 1 1 0 0 1
   */

  public char[] apply(char[] state) {
    //TODO

    return null;
  }

  /*
   *  switch '0' -> '1'  or  '1'-> '0'
   */
  private char switchOneState(char c) {
    return c == '0' ? '1' : '0';
  }
}
