package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

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
//odp - wiersz 5, 11-15 były źle sformatowane
//odp - kombinacja klawiszy alt + strzałka powoduje przełączanie się między plikami