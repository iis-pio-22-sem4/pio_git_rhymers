package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int EMPTY_LIST = -1;
	private Node last;
	private int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	private boolean isEmpty() {
		return last == null;
	}

	private boolean isFull() {
		return false;
	}

	public final int top() {
		if (isEmpty())
			return EMPTY_LIST;
		return last.getValue();
	}

	public final int pop() {
		if (isEmpty())
			return EMPTY_LIST;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
