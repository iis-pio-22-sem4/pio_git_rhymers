package edu.kis.vh.nursery;

public class hanoiRhymer extends defaultCountOutRhymer {
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