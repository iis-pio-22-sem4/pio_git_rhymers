package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class HanoiRhymerUnitTest {
  Random random = new Random();
  HanoiRhymer hanoiRhymer;

  @Before
  public void setUp (){
    hanoiRhymer = new HanoiRhymer();
  }

  @Test
  public void testReportRejected() {

    int testValue = 0;
    int result = hanoiRhymer.reportRejected();

    Assert.assertEquals(testValue, result);

  }

  @Test
  public void testCountIn() {
    int testValue = random.nextInt();
    hanoiRhymer.countIn(testValue);

    int result = hanoiRhymer.peekaboo();
    Assert.assertEquals(testValue, result);
  }
}