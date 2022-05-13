package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

  private static final int MAX_TABLE = 11;
  private static final int TABLE_SIZE = 12;
  private static final int EMPTY_TABLE = -1;
  private final int[] numbers = new int[TABLE_SIZE];
  private int total = EMPTY_TABLE;

  //TODO: nazwa funkcji sugeruje że zwraca ilość elementów, jednak zwraca ona index ostatniego elementu

  public int getTotal() {
    return total;
  }

  public void countIn(int in) {
    if (!isFull())
      numbers[++total] = in;
  }

  public boolean callCheck() {
    return total == EMPTY_TABLE;
  }

  public boolean isFull() {
    return total == MAX_TABLE;
  }

  //TODO: Nazwa funkcji w żaden sposób nie informuje o tym za do odpowiada

  protected int peekaboo() {
    if (callCheck())
      return EMPTY_TABLE;
    return numbers[total];
  }

  public int countOut() {
    if (callCheck())
      return EMPTY_TABLE;
    return numbers[total--];
  }

}
