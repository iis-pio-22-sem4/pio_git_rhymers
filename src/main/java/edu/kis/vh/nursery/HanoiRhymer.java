package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {
	//5 wiersz byl zle sformatowany
	int totalRejected = 0;

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
//