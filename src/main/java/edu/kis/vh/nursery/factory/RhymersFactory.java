package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface RhymersFactory {

	public DefaultCountingOutRhymer GetStandardRhymer();

	public DefaultCountingOutRhymer GetFalseRhymer();

	public DefaultCountingOutRhymer GetFIFORhymer();

	public DefaultCountingOutRhymer GetHanoiRhymer();

}
//kombinacja klawiszy działa poprawnie - służy do przełączania się pomiędzy otwartymi oknami w środowisku programistycznym