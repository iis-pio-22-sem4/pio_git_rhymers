package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static class Node {

		private final int value;
		private Node prev;
		private Node next;
		public Node(int i) {
			value = i;
		}
	}

	Node last;
	int i;

	/**
	 * METODA DODAJE ELEMENT NA KONIEC LISTY
	 *
	 * @param i - element który chcemy dodać do listy
	 */

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	/**
	 * METODA ZWRACA INFORMACJE CZY LISTA JEST PUSTA
	 * @return true - jeśli lista jest pusta; false gdy lista posiada elementy
	 */

	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * METODA ZWRACA INFORMACJE CZY LISTA JEST ZAPELNIONA
	 * @return false - lista zwraca zawsze faslse
	 */

	public boolean isFull() {
		return false;
	}

	/**
	 * METODA ZWRACA OSTATNI ELEMENT NA LISCIE
	 * @return -1 gdy lista jest pusta lub wartość ostaniego elementu z listy
	 */

	public int top() {
		if (isEmpty())
			return -1;
		return last.value;
	}

	/**
	 * METODA ZWRACA I USUWA OSTATNI ELEMENT NA LISCIE
	 * @return -1 gdy lista jest pusta lub wartość ostaniego elementu z listy
	 */

	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
