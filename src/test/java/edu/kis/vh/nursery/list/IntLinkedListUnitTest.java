package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.HanoiRhymer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class IntLinkedListUnitTest {
  Random random = new Random();
  int EMPTY_LIST = -1;

  IntLinkedList linkedList;

  @Before
  public void setUp() {
    linkedList = new IntLinkedList();
  }

  @Test
  public void testPush() {

    int value = random.nextInt();
    linkedList.push(value);
    int result = linkedList.pop();

    Assert.assertEquals(value, result);

  }

  @Test
  public void testIsEmpty() {
    boolean result = linkedList.isEmpty();
    Assert.assertTrue(result);

    int value = random.nextInt();

    linkedList.push(value);
    linkedList.pop();

    result = linkedList.isEmpty();
    Assert.assertTrue(result);
  }

  @Test
  public void testIsFull() {
    Assert.assertFalse(linkedList.isFull());
  }

  @Test
  public void testTop() {
    int result = linkedList.top();
    Assert.assertEquals(EMPTY_LIST, result);

    int value = random.nextInt();
    linkedList.push(value);
    result = linkedList.top();
    Assert.assertEquals(value, result);

    linkedList.pop();
    result = linkedList.top();
    Assert.assertEquals(EMPTY_LIST, result);
  }

  @Test
  public void testPop() {
    int result = linkedList.pop();
    Assert.assertEquals(EMPTY_LIST, result);

    int value = random.nextInt();

    linkedList.push(value);
    result = linkedList.pop();
    Assert.assertEquals(value, result);


  }
}