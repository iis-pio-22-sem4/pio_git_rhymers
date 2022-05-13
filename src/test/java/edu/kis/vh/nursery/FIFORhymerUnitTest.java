package edu.kis.vh.nursery;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.Random;

public class FIFORhymerUnitTest extends TestCase {
  Random random = new Random();
  final int EMPTY_STACK_VALUE = -1;

  public void testCountOut() {
    FIFORhymer rhymer = new FIFORhymer();

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