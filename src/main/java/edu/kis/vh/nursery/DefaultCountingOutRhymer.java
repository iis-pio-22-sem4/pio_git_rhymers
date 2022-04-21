package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int startNumber = -1;
    public static final int finalNumber = 11;
    public static final int counter = 12;
    private int[] numbers = new int[counter];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == startNumber;
    }

    public boolean isFull() {
        return total == finalNumber;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
