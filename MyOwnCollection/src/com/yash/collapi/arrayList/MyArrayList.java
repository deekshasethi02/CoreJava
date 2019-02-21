package com.yash.collapi.arrayList;

public class MyArrayList<E> implements List{

	Object objArray[] = new Object[5];
	int elementCount = 0;

	/**
	 * Adds the element into list
	 * @param obj is element to be added in list
	 * @return list of all the elements in the array
	 */
	public void add(Object obj) {
		if (elementCount >= objArray.length) {
			increaseCapacity();
		}

		objArray[elementCount] = obj;
		elementCount++;

	}

	/**
	 * Increases the capacity of array
	 * @return returns new array with increased capacity
	 */
	private void increaseCapacity() {
		int newCapacity = objArray.length * 2;
		Object newArray[] = new Object[newCapacity];
		for (int i = 0; i < objArray.length; i++) {
			newArray[i] = objArray[i];

		}
		objArray = newArray;
	}

	
	
	
	
	
	/**
	 * @return returns the list of elements in the array
	 */
	public Object[] list() {
		return objArray;
	}

	/**
	 * @return returns the size of array
	 */
	public int size() {
		int size = 0;
		for (int i = 0; i < objArray.length; i++) {

			if (objArray[i] != null) {

				size++;
			}
		}

		// System.out.println("total size of the list " + size);
		return size;
	}

	
//	/**
//	 * checks if element is present in list
//	 * @param obj is element to be searched
//	 * @return returns true if element is found in array list
//	 */
//	public boolean contains(Object obj) {
//		boolean check = false;
//		for (int i1 = 0; i1 < elementCount; i1++) {
//
//			if (objArray[i1] == obj) {
//				check = true;
//			}
//		}
//		return check;
//	}
//
//	/**
//	 * returns the element at the specified position
//	 * @param i is index of the element to be retrieved
//	 */
//	public void get(int i) {
//		System.out.println("Retrieved element at " + i + "position is :" + objArray[i]);
//
//	}
//
//	/**
//	 * removes the element at the specified index in list
//	 * 
//	 * @param obj
//	 *            is element to be removed
//	 */
//	public boolean remove(Object obj) {
//		Object temp = 0;
//		for (int i = 0; i < objArray.length; i++) {
//
//			if (objArray[i] == obj) {
//
//				objArray[i] = null;
//				for (int j = i; j < objArray.length - 1; j++) {
//
//					temp = objArray[j + 1];
//					objArray[j] = temp;
//
//				}
//			}
//
//		}
//		return true;
//
//	}
//
//	/**
//	 * Displays the list of elements in the array
//	 */
//	public void display() {
//		StringBuilder sb = new StringBuilder("[");
//
//		for (int i = 0; i < size(); i++) {
//
//			sb.append(objArray[i]);
//			if (i < size() - 1) {
//				sb.append(",");
//
//			}
//		}
//		sb.append("]");
//		System.out.println(sb);
//	}
//
//	/**
//	 * Replaces the element at given index
//	 * 
//	 * @param i
//	 * @param element
//	 * @return returns true if the element is replaced
//	 * 
//	 */
//	public boolean set(int i, Object element) {
//		objArray[i] = element;
//		return true;
//
//	}
//
//	public Object[] insert(int index, Object obj) {
//
//		if (elementCount + 1 >= objArray.length) {
//			increaseCapacity();
//			for (int i = elementCount + 1; i >= index; i--) {
//				objArray[i] = objArray[i - 1];
//			}
//			objArray[index] = obj;
//			elementCount++;
//		} else {
//			for (int i = elementCount + 1; i >= index; i--) {
//				objArray[i] = objArray[i - 1];
//			}
//			objArray[index] = obj;
//			elementCount++;
//		}
//		return objArray;
//	}

	
}
