package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface Rhymersfactory {

	public DefaultCountingOutRhymer GetStandardRhymer();

	public DefaultCountingOutRhymer GetFalseRhymer();

	public DefaultCountingOutRhymer GetFIFORhymer();

	public DefaultCountingOutRhymer GetHanoiRhymer();
}

// efekt działania kombinacji klawiszów alt + <-/->
// powoduje zmianę otwartej na widoku strony
// przechodzenie pomiędzy otwrtymi plikami do edycji w IDE
// należy mieć otwarte przynajmniej dwa pliki do wizualnego efektu