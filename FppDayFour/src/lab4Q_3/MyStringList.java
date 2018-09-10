package lab4Q_3;

import java.util.Arrays;

public class MyStringList {

	private final int INITIAL_LENGTH = 2;
	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	public void add(String s) {
		// implement
		if (size == strArray.length) {
			resize();
		}
		strArray[size] = s;
		size++;
	}

	public String get(int i) {
		// implement
		if (i < 0 || i >= size) {
			throw new ArrayIndexOutOfBoundsException(i);
		}
		return strArray[i];
	}

	public boolean find(String s) {
		// implemement
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].equalsIgnoreCase(s)) {
				return true;
			}

		}
		return false;
	}

	public void insert(String s, int pos) {
		// implement
		if (size == strArray.length) {
			resize();
		}
		if (pos == size) {
			add(s);
		} else {
			for (int i = size; i > pos; i--) {

				strArray[i] = strArray[i - 1];
			}
			strArray[pos] = s;
			size++;

		}
	}

	public boolean remove(String s) {
		// implement
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].equalsIgnoreCase(s)) {
				int j;
				for (j = i; j < strArray.length - 1; j++) {
					strArray[j] = strArray[j + 1];

				}
				strArray[j] = null;
				--size;
				return true;
			}

		}

		return false;
	}

	private void resize() {
		// implemen
		if (size == strArray.length) {
			int x = size * 2;

			strArray = Arrays.copyOf(strArray, x);
		}
	}

	public String toString() {
		// implement
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			// if (strArray[i] != null)
			sb.append(strArray[i] + ", ");
		}
		sb.append(strArray[size - 1] + "]");
		return sb.toString();

	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.insert("Richard", 3);
		System.out.println("The list of size " + l.size() + " after inserting Richard into pos 3 is " + l);
		l.insert("Tonya", 0);
		System.out.println("The list of size " + l.size() + " after inserting Tonya into pos 0 is " + l);
	}

}
