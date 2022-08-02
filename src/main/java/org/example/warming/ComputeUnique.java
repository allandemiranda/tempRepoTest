package org.example.warming;

import java.util.ArrayList;
import java.util.List;

/**
 * 2. Unique chars in a string
 */
public class ComputeUnique {

  private static final String TEST_1 = "Aa12";
  private static final String TEST_2 = "A[}";
  private static final String TEST_4 = "$VmpKVloxbFhOV3RKUnpreFkyZHZTMk16VW5aamJWVm5XVmMxYTB3eU9YbEpSMFpxV1R[KV2VtTjVRbkJpYlZwMlkyMHhhR1JIYkhaaWFVSjJZbWxDYUVsSFVteGtiV3hxV2xOM1oyTXpWbXBoUTBKb1kzbENhbUl5";

  /**
   * Write a method that receives a string by parameter, then compute the number of unique chars and then return this
   * computes value. The method could be called thousands of times with the same input value. Example: Input: Aa12
   * Output: 4
   * <p>
   * Input: A[} Output:3
   * <p>
   * Input: null string Output: 0
   * <p>
   * Input:
   * $VmpKVloxbFhOV3RKUnpreFkyZHZTMk16VW5aamJWVm5XVmMxYTB3eU9YbEpSMFpxV1R[KV2VtTjVRbkJpYlZwMlkyMHhhR1JIYkhaaWFVSjJZbWxDYUVsSFVteGtiV3hxV2xOM1oyTXpWbXBoUTBKb1kzbENhbUl5
   * Output: 48
   */
  public static void main(String[] args) {
    //! Input List
    List<String> inputList = new ArrayList<>();
    inputList.add(TEST_1);
    inputList.add(TEST_2);
    inputList.add(null);
    inputList.add(TEST_4);

    //! Computing
    for (String input : inputList) {
      System.out.println(computingTheString(input));
    }
  }

  /**
   * The computing the string
   *
   * @param input the string input value
   *
   * @return number of unique chars
   */
  public static int computingTheString(String input) {
    //! Don't change the method signature
    // TODO
    return 0;
  }

}
