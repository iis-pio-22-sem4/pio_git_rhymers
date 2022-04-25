package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	public static final int VAL_DEFAULT = 0;
	int totalRejected = VAL_DEFAULT;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
	if (!callCheck() && in > peekaboo())
		totalRejected++;
	else
		super.countIn(in);
	}
}
