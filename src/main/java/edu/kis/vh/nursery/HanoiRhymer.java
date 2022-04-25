package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
// 5 linia zmiana niepoprawnej tablulacji
// 7 linia nawiasy klamrowe w jednej lini
// metoda countIn ma błędy związane z wcięciami w kodzie

// funkcjonalnosc alt + -> bardzo przydaje sie w poruszaniu po plikach projektu