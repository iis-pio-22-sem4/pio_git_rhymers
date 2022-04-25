package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

  public static final int TABLE_SIZE = 12;
  public static final int CALL_CHECK_FAIL = -1;
  public static final int INIT = -1;
  public static final int MAX = TABLE_SIZE - 1;
  private int[] NUMBERS = new int[TABLE_SIZE];

  public int total = INIT;

  public void countIn(int in) {
    if (!isFull())
      NUMBERS[++total] = in;
  }

  public boolean callCheck() {
    return total == INIT;
  }

  public boolean isFull() {
    return total == MAX;
  }

  protected int peekaboo() {
    if (callCheck())
      return CALL_CHECK_FAIL;
    return NUMBERS[total];
  }

  public int countOut() {
    if (callCheck())
      return CALL_CHECK_FAIL;
    return NUMBERS[total--];
  }

}
