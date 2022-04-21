package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int tabSize = 12;
    public static final int checkVal = -1;
    public static final int fullVal = 11;
    private int[] numbers = new int[tabSize];

    public int total = checkVal;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
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
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return checkVal;
        return numbers[total--];
    }

}
