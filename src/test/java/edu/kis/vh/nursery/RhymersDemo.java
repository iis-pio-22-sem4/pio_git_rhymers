package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

	/**
	 * @description firstly creating object factory (of type Rhymersfactory from interface Rhymersfactory, then launching testRhymers method
	 * @param args arguments of main method are strings
	 */
	public static void main(String[] args) {
		Rhymersfactory factory = new DefaultRhymersFactory();

		testRhymers(factory);

	}

	//Walidacja projektu testami przebiegla pomyslnie

	/**
	 * @description testing usage and printing it to user
	 * @param factory argument of method testRhymers is of type Rhymersfactory
	 */
	private static void testRhymers(Rhymersfactory factory) {
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				rhymers[j].countIn(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			rhymers[3].countIn(rn.nextInt(20));

		for (int i = 0; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[3]).reportRejected());
	}

}