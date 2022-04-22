package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int tabSize = 12;
    private static final int checkVal = -1;
    private static final int fullVal = 11;
    private final int[] numbers = new int[tabSize];

    private int total = checkVal;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }

    public boolean callCheck() {
        return total == checkVal;
    }

    public boolean isFull() {
        return total == fullVal;
    }

    protected int peekaboo() {
        if (callCheck())
            return checkVal;
        return getNumbers()[total];
    }

    public int countOut() {
        if (callCheck())
            return checkVal;
        return getNumbers()[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }
}
