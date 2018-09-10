package lab4Q3;

import java.util.Arrays;

public class AccountList  {
	private final int INITIAL_LENGTH = 2;
	private Account[] accArray;
	private int size;

	public AccountList() {
		accArray = new Account[INITIAL_LENGTH];
		size = 0;
	}

	public void add(Account acc) {
		// implement
		if (size == accArray.length) {
			resize();
		}
		accArray[size] = acc;
		size++;
	}

	public Account get(int i) {
		// implement
		if (i < 0 || i >= size) {
			throw new ArrayIndexOutOfBoundsException(i);
		}
		return accArray[i];
	}

	public boolean find(Account acc) {
		// implemement
		for (int i = 0; i < accArray.length; i++) {
			if ( accArray[i].equals(acc)) {
				return true;
			}

		}
		return false;
	}

	public void insert(Account s, int pos) {
		// implement
		if (size == accArray.length) {
			resize();
		}
		if (pos == size) {
			add(s);
		} else {
			for (int i = size; i > pos; i--) {

				accArray[i] = accArray[i - 1];
			}
			accArray[pos] = s;
			size++;

		}
	}

	public boolean remove(Account acc) {
		// implement
		for (int i = 0; i < accArray.length; i++) {
			if (accArray[i].equals(acc)) {
				int j;
				for (j = i; j < accArray.length - 1; j++) {
					accArray[j] = accArray[j + 1];

				}
				accArray[j] = null;
				--size;
				return true;
			}

		}

		return false;
	}

	private void resize() {
		// implemen
		if (size == accArray.length) {
			int x = size * 2;

			accArray = Arrays.copyOf(accArray, x);
		}
	}

	public String toString() {
		// implement
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			// if (strArray[i] != null)
			sb.append(accArray[i] + ", ");
		}
		sb.append(accArray[size - 1] + "]");
		return sb.toString();

	}

	public int size() {
		return size;
	}
}
