package org.example.warming;

/**
 * 3. Convexity
 */
public class Convexity {
  /**
   * We have an array of numbers, which represents the ATM volatility,
   * this volalility function is convex:
   * [ � >= v80 >= v90 >=    v100   <= v110 <= v120 <= �]
   *
   * graph function can be:
   *  |            |    *      |*           |*      *
   *  |            |   *       | *          | *    *
   *  | * * *      |*          |    *       |   * *
   *  |______      |_______    |_______     |_______________________
   *   const       ascending   decreasing   decreasing and ascending
   *   function    function    function     function
   *
   * Propose an algorithm to validate this market data
   */

  public boolean isConvex(double[] atmVol) {
    //TODO

    return false;
  }
}
