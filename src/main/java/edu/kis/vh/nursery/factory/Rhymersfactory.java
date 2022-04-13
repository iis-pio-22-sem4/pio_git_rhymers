package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;

public interface Rhymersfactory {

	public defaultCountingOutRhymer GetStandardRhymer();

	public defaultCountingOutRhymer GetFalseRhymer();

	public defaultCountingOutRhymer GetFIFORhymer();

	public defaultCountingOutRhymer GetHanoiRhymer();

}

// efekt działania kombinacji klawiszów alt + <-/->
// powoduje zmianę otwartej na widoku strony
// przechodzenie pomiędzy otwrtymi plikami do edycji w IDE
// należy mieć otwarte przynajmniej dwa pliki do wizualnego efektu