package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface Rhymersfactory {

	public DefaultCountingOutRhymer getStandardRhymer();

	public DefaultCountingOutRhymer getFalseRhymer();

	public DefaultCountingOutRhymer getFIFORhymer();

	public DefaultCountingOutRhymer getHanoiRhymer();

}

// efekt działania kombinacji klawiszów alt + <-/->
// powoduje zmianę otwartej na widoku strony
// przechodzenie pomiędzy otwrtymi plikami do edycji w IDE
// należy mieć otwarte przynajmniej dwa pliki do wizualnego efektu