package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class RhymersJUnitTest {

	//tests passed
	Random random = new Random();
	final int EMPTY_STACK_VALUE = -1;
	final int STACK_CAPACITY = 12;

	DefaultCountingOutRhymer rhymer;

	@Before
	public void setUp (){
		rhymer = new DefaultCountingOutRhymer();
	}

	@Test
	public void testCountIn() {
		int testValue = random.nextInt();
		rhymer.countIn(testValue);

		int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
		boolean result = rhymer.callCheck();
		Assert.assertTrue(result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertFalse(result);
	}

	@Test
	public void testIsFull() {

		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertFalse(result);
			rhymer.countIn(888);
		}

		boolean result = rhymer.isFull();
		Assert.assertTrue( result);
	}

	@Test
	public void testPeekaboo() {

		int result = rhymer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = random.nextInt();
		rhymer.countIn(testValue);

		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);

	}

	@Test
	public void testCountOut() {

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = random.nextInt();
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);

		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
