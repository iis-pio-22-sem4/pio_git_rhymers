package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int SIZE = 12;
	private static final int ERROR = -1;
	private static final int FULL = 11;
	private int[] numbers = new int[SIZE];
	private int total = -1;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			getNumbers()[++total] = in;
	}

	public boolean callCheck() {
		return total == ERROR;
	}
		
	public boolean isFull() {
		return total == FULL;
	}
		
	protected int peekaboo() {
		if (callCheck())
			return ERROR;
		return getNumbers()[total];
	}
			
	public int countOut() {
		if (callCheck())
			return ERROR;
		return getNumbers()[total--];
	}

	public int[] getNumbers() {
		return numbers;
	}
	
}
