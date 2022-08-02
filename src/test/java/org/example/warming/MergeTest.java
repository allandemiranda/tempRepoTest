package org.example.warming;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

/**
 * The type Merge test.
 */
class MergeTest {

  /**
   * Gets merge example.
   */
  @Test
  void getMergeExample() {
    // given
    Map<String, Long> pam = new HashMap<>();
    Map<String, Long> lamp = new HashMap<>();
    pam.put("A", 1L);
    lamp.put("C", 1000L);
    pam.put("B", 1L);
    lamp.put("B", 1000L);
    lamp.put("A", 1L);
    // when
    Map<String, Long> a = Merge.getMerge(pam, lamp);
    // then
    assertEquals("{A=2, B=1001, C=1000}", a.toString());
  }

  /**
   * Gets merge example 2.
   */
  @Test
  void getMergeExample2() {
    // given
    Map<String, Long> abc = new HashMap<>();
    Map<String, Long> dfg = new HashMap<>();
    dfg.put("A", 1L);
    abc.put("C", 1000L);
    dfg.put("B", 1L);
    abc.put("B", 1000L);
    abc.put("A", 1L);
    // when
    Map<String, Long> a = Merge.getMerge(dfg, abc);
    // then
    assertEquals("{A=2, B=1001, C=1000}", a.toString());
  }

  /**
   * Gets merge a.
   */
  @Test
  void getMergeA() {
    // given
    Map<String, Long> pam = new HashMap<>();
    Map<String, Long> lamp = new HashMap<>();
    pam.put("A", 1L);
    pam.put("C", 101L);
    lamp.put("C", 1000L);
    lamp.put("A", 1000L);
    lamp.put("D", 1L);
    // when
    Map<String, Long> a = Merge.getMerge(pam, lamp);
    // then
    assertEquals("{A=1001, C=1101, D=1}", a.toString());
  }

  /**
   * Gets merge empty.
   */
  @Test
  void getMergeEmpty() {
    // given
    Map<String, Long> pam = new HashMap<>();
    Map<String, Long> lamp = new HashMap<>();
    lamp.put("C", 1101L);
    lamp.put("A", 1001L);
    lamp.put("D", 1L);
    // when
    Map<String, Long> a = Merge.getMerge(pam, lamp);
    // then
    assertEquals("{A=1001, C=1101, D=1}", a.toString());
  }

  /**
   * Gets merge empty 2.
   */
  @Test
  void getMergeEmpty2() {
    // given
    Map<String, Long> pam = new HashMap<>();
    Map<String, Long> lamp = new HashMap<>();
    pam.put("C", 1101L);
    pam.put("A", 1001L);
    pam.put("D", 1L);
    // when
    Map<String, Long> a = Merge.getMerge(pam, lamp);
    // then
    assertEquals("{A=1001, C=1101, D=1}", a.toString());
  }

  /**
   * Gets merge empty 3.
   */
  @Test
  void getMergeEmpty3() {
    // given
    Map<String, Long> pam = new HashMap<>();
    Map<String, Long> lamp = new HashMap<>();
    // when
    Map<String, Long> a = Merge.getMerge(pam, lamp);
    // then
    assertEquals("{}", a.toString());
  }

  /**
   * Gets merge null.
   */
  @Test
  void getMergeNull() {
    // given
    Map<String, Long> lamp = new HashMap<>();
    // when
    // then
    assertThrows(IllegalArgumentException.class, () -> Merge.getMerge(null, lamp));
    assertThrows(IllegalArgumentException.class, () -> Merge.getMerge(lamp, null));
    assertThrows(IllegalArgumentException.class, () -> Merge.getMerge(null, null));
  }

  /**
   * Gets merge null 2.
   */
  @Test
  void getMergeNull2() {
    // given
    Map<String, Long> pam = new HashMap<>();
    Map<String, Long> lamp = new HashMap<>();
    pam.put("A", 1L);
    lamp.put("C", 1000L);
    pam.put("B", null);
    lamp.put("B", 1000L);
    lamp.put("A", 1L);
    // when
    // then
    assertThrows(IllegalArgumentException.class, () -> Merge.getMerge(pam, lamp));
  }
}