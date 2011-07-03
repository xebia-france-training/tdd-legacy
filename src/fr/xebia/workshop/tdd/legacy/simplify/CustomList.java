package fr.xebia.workshop.tdd.legacy.simplify;

/**
 *  Make readable - clean and simplify - the method add(Object element) by
 *  1. adding unit tests for the add method
 *  2. check your coverage with Eclemma
 *  3. then refactor the add method to make it clearer 
 *  
 *  You can then find other simplification for the class
 *  1. factory method to create read only instance
 *  2. ...
 */

public class CustomList {

	private boolean readOnly;
	private Object[] elements;
	private int size;

	public CustomList() {
		this.elements = new Object[0];
		this.size = 0;
		this.readOnly = true;
	}

	public void add(Object element) {
		if (!readOnly) {
			int newSize = size + 1;
			if (newSize > elements.length) {
				Object[] newElements = new Object[elements.length + 10];
				for (int i = 0; i < size; i++) {
					newElements[i] = elements[i];
				}
				elements = newElements;
			}
			elements[size++] = element;
		}
	}

	public int getSize() {
		return size;
	}

	public Object getElement(int index) {
		return elements[index];
	}

	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}
}
