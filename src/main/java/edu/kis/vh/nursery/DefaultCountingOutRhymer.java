package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int SIZE = 12;
	public static final int START_VAL = -1;

	final private int[] numbers = new int[SIZE];

	public int[] getNumbers() {
		return numbers;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	private int total = START_VAL;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == START_VAL;
	}

	public boolean isFull() {
		return total == SIZE-1;
	}
		
	protected int peekaboo() {
		if (callCheck()) {
			return -1;
		}
		return numbers[total];
	}

	public int countOut() {
		if (callCheck()) {
			return -1;
		}
		return numbers[total--];
	}

}
