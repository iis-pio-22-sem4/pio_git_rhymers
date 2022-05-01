package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	
	public static final int SIZE = 12;
	public static final int INITIAL_COUNT = -1;

    public int total = INITIAL_COUNT;
    private final int[] numbers = new int[SIZE];

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean callCheck() {
        return total == INITIAL_COUNT;
    }

    public boolean isFull() {
        return total == SIZE - 1;
    }

    public int getTotal() {
        return total;
    }

    protected int callPeekaboo() {
        if (callCheck())
            return INITIAL_COUNT;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return INITIAL_COUNT;
        return numbers[total--];
    }

}
//alt ze strzalka w lewo lub prawo przęłącza nas miedzy okienkami czyli klasami itp









