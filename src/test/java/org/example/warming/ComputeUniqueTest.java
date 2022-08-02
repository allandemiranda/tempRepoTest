package org.example.warming;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

/**
 * The type Compute unique test.
 */
class ComputeUniqueTest {

  private static final String TEST_1 = "Aa12";
  private static final String TEST_2 = "A[}";
  private static final String TEST_4 = "$VmpKVloxbFhOV3RKUnpreFkyZHZTMk16VW5aamJWVm5XVmMxYTB3eU9YbEpSMFpxV1R[KV2VtTjVRbkJpYlZwMlkyMHhhR1JIYkhaaWFVSjJZbWxDYUVsSFVteGtiV3hxV2xOM1oyTXpWbXBoUTBKb1kzbENhbUl5";

  /**
   * Computing the string.
   */
  @Test
  void computingTheString() {
    // given
    List<String> inputList = new ArrayList<>();
    inputList.add(TEST_1);
    inputList.add(TEST_2);
    inputList.add(null);
    inputList.add(TEST_4);
    // when
    List<Object> result = inputList.stream().map(ComputeUnique::computingTheString).collect(Collectors.toList());
    // then
    assertEquals("[4, 3, 0, 48]", result.toString());
  }
}