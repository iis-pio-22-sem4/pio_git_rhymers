package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.hanoiRhymer;

public class DefaultRhymersFactory implements Rhymersfactory {

	@Override
	public defaultCountOutRhymer GetStandardRhymer() {
		return new defaultCountOutRhymer();
	}

	@Override
	public defaultCountOutRhymer GetFalseRhymer() {
		return new defaultCountOutRhymer();
	}

	@Override
	public defaultCountOutRhymer GetFIFORhymer() {
		return new FIFORhymer();
	}

	@Override
	public defaultCountOutRhymer GetHanoiRhymer() {
		return new hanoiRhymer();
	}

}
