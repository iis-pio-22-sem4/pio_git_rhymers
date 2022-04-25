package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

  private static final int MAX = 11;
  private static final int TABLE_SIZE = 12;
  private final int[] NUMBERS = new int[TABLE_SIZE];
  private static final int ERROR = -1;
  private static final int CALL_CHECK_FAIL = -1;

  private int total = ERROR;

  public void setTotal(int total) {
    this.total = total;
  }

  public int getTotal() {
    return total;
  }

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
      return CALL_CHECK_FAIL;
    return NUMBERS[total];
  }

  public int countOut() {
    if (callCheck())
      return CALL_CHECK_FAIL;
    return NUMBERS[total--];
  }

}
