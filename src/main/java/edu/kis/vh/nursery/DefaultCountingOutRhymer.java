package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int startNumber = -1;
    public static final int fullNumber = 11;
    public static final int numbersCount = 12;
    private int[] numbers = new int[numbersCount];

    public int total = startNumber;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() { return total == startNumber; }

    public boolean isFull() {
        return total == fullNumber;
    }

    protected int peekaboo() {
        if (callCheck())
            return startNumber;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return startNumber;
        return numbers[total--];
    }

}
