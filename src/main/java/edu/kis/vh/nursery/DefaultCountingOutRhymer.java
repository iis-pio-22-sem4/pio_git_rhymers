package edu.kis.vh.nursery;

/***
 * Klasa w której manipuluje się na kontenerze (tablicy), w której manipuluje się wskaźnikiem/licznikiem na zwrócenie pewnej wartości, usuwania lub dodawania.
 * ***/
public class DefaultCountingOutRhymer {

	private static final int ARRAY_CAPACITY = 12;
	private static final int ARRAY_EMPTY = -1;
	private static final int START_VALUE = -1;
	private static final int ARRAY_FULL = 11;
	private final int[] numbers = new int[ARRAY_CAPACITY];

	private int total = START_VALUE;

	/***
	 * Metoda ustawia licznik o jeden w górę i zapisuje wartość w konterze używając argumentu metody.
	 * @param in wartość typu integer, która zostaje zapisane w konterze, gdzie wskazuje licznik
	 * ***/
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/***
	 * Metoda sprawdza czy licznik jest ustawiony na wartości początkowej.
	 * @return true wskażnik ustawiony na wartość -1 lub false, jeśli posiada inną wartość
	 * ***/
	public final boolean callCheck() {
			return total == START_VALUE;
		}

	/***
	 * Metoda sprawdza czy licznik wychodzi poza długość kontenera przechowującego wartości.
	 * @return true jeśli licznik posiada wartość długości tablicy lub false, jeśli nie posiada.
	 * ***/
	public final boolean isFull() {
		return total == ARRAY_FULL;
	}

	/***
	 * Metoda zwraca wartość na której znajduje się licznik.
	 * @return wartośćz kontenera lub wartość -1, ponieważ licznik jest ustawiony spoza zakresu tablicy
	 * ***/
	protected final int peekaboo() {
		if (callCheck())
			return ARRAY_EMPTY;
		return numbers[total];
	}

	/***
	 * Metoda zwraca wartość na której znajduje się licznik, a następnie zmniejsza o jeden licznik.
	 * @return wartość na którą wskazuje licznik lub -1, jeśli licznik jest spoza zakresu
	 * ***/
	public int countOut() {
		if (callCheck())
			return ARRAY_EMPTY;
		return numbers[total--];
	}

}
