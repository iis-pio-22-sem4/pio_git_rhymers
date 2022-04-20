package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int ARRAY_CAPACITY = 12;
	public static final int ARRAY_EMPTY = -1;
	public static final int ARRAY_FULL = 11;
	private final int[] numbers = new int[ARRAY_CAPACITY];

	
	public int total = ARRAY_EMPTY;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
			return total == ARRAY_EMPTY;
		}
		
	public boolean isFull() {
		return total == ARRAY_FULL;
	}

	protected int peekaboo() {
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
