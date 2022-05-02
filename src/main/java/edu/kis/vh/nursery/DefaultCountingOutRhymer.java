package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int ARRAY_CAPACITY = 12;
	private static final int ARRAY_EMPTY = -1;
	private static final int START_VALUE = -1;
	private static final int ARRAY_FULL = 11;
	private final int[] numbers = new int[ARRAY_CAPACITY];

	private int total = START_VALUE;

	private int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public final boolean callCheck() {
			return total == ARRAY_EMPTY;
		}
		
	public final boolean isFull() {
		return total == ARRAY_FULL;
	}

	protected final int peekaboo() {
		if (callCheck())
			return ARRAY_EMPTY;
		return numbers[total];
	}
			
	public int countOut() {
		if (callCheck())
			return ARRAY_EMPTY;
		return numbers[total--];
	}

}
