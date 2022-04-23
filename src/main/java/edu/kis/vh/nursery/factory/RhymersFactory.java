package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface RhymersFactory {

	public DefaultCountingOutRhymer getStandardRhymer();

	public DefaultCountingOutRhymer getFalseRhymer();

	public DefaultCountingOutRhymer getFIFORhymer();

	public DefaultCountingOutRhymer getHanoiRhymer();

}
//kombinacja klawiszy działa poprawnie - służy do przełączania się pomiędzy otwartymi oknami w środowisku programistycznym