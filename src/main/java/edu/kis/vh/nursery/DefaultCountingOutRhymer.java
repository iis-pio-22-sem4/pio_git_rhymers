package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

  public static final int MAX = 11;
  public static final int TABLE_SIZE = 12;
  private int[] NUMBERS = new int[TABLE_SIZE];
  public static final int ERROR = -1;
  public static final int CALLCHECK_FAIL = -1;

  public int total = ERROR;

  public void countIn(int in) {
    if (!isFull())
      NUMBERS[++total] = in;
  }

  public boolean callCheck() {
    return total == ERROR;
  }

  public boolean isFull() {
    return total == MAX;
  }

  protected int peekaboo() {
    if (callCheck())
      return CALLCHECK_FAIL;
    return NUMBERS[total];
  }

  public int countOut() {
    if (callCheck())
      return CALLCHECK_FAIL;
    return NUMBERS[total--];
  }

}
