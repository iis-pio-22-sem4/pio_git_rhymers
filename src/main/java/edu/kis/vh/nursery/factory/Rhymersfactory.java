package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountOutRhymer;

	public interface Rhymersfactory {
	
		public defaultCountOutRhymer GetStandardRhymer();
		
		public defaultCountOutRhymer GetFalseRhymer();
		
		public defaultCountOutRhymer GetFIFORhymer();
		
		public defaultCountOutRhymer GetHanoiRhymer();
		
	}
