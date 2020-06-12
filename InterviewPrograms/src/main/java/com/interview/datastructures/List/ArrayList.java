package com.interview.datastructures.List;

public class ArrayList {
	private static int maxsize;
	private static Object data[];
	private static int index;

	public ArrayList() {
		maxsize = 5;
		data = new Object[5];
		index = -1;
	}

	public void add(Object obj) {
		int totalelts = index + 1;

		// 1. if size is exceeding then increase the size (call reallocate
		// method)
		// 2. increment the index
		// 3. add the current element
		if (totalelts == maxsize) {
			reallocate();
		}
		index++;
		data[index] = obj;
	}

	public void reallocate() {
		// 1. Store the value of maxsize in another variable (oldsize)
		// 2. increment the value of maxsize by 5
		// 3. Allocate a new array of objects of maxsize (newdata)
		// 4. Copy the contents of data array into newdata
		// 5. Finally assign the reference of newdata to data
		int oldsize = maxsize;

		maxsize = maxsize + 5;

		Object newdata[] = new Object[maxsize];
		for (int i = 0; i < oldsize; i++) {
			newdata[i] = data[i];
		}
		data = newdata;
	}

	public void remove(int pos) {

		// 1. Check whether the position exists in the array or not
		// 1-->1. if pos > index then deletion not possible
		// 1-->2. if pos < index then deletion is possible
		// 2. To delete the element at that pos start a loop from that position
		// & shift all the elements at right
		// to the left
		// 2-->1.Finally decrement the value of index after iteration stops

		if (pos > index) {
			System.out.println("\nDeletion not posssible ");
			System.exit(0);
		}

		else {

			System.out.println();

			System.out.println(" elt at " + pos + " is " + data[pos]);

			for (int i = pos; i <= index; i++) {
				data[i] = data[i + 1];
			}
			index--;
		}
	}

	public void disp() {
		int totalelts = index + 1;
		System.out.println(" The total number of elements are " + totalelts);
		System.out.println(" The size allowed is " + maxsize);
		System.out.println(" The contents of the ArrayList are ");

		for (int i = 0; i < totalelts; i++) {
			System.out.println();
			System.out.print(data[i]);
		}
	}
}

