package edu.kis.vh.nursery;


/**
 * Class to count out numbers
 */
public class DefaultCountingOutRhymer {


    private static final int SIZE = 12;
    private static final int ERROR = -1;
    private static final int FULL = 11;

    private final int[] numbers = new int[SIZE];

    private int total = -1;

    /**
     * @param in Function fills the numbers with the parameter in
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * @return Function check if the table is empty
     */
    public boolean callCheck() {
        return total == ERROR;
    }

    /**
     * @return Function check if the table is full
     */
    public boolean isFull() {
        return total == FULL;
    }

    /**
     * @return Returns the last element
     */
    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }
    /**
     * @return Return last element and decrease total number of elements
     */
    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

}
