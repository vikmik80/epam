package main.java.by.mikshuta.task1.service;

import main.java.by.mikshuta.task1.entity.WorkArray;
public class ArraySort {
	public ArraySort() {
	}
	public void sortBubble(WorkArray array) {
		int[] arrayTmp = array.getWorkArray();
		int k;
		for (int i = 1; i < arrayTmp.length; i++) {
			for (int j = 0; j < arrayTmp.length - i; j++) {
				if (arrayTmp[j] > arrayTmp[j + 1]) {
					k = arrayTmp[j];
					arrayTmp[j] = arrayTmp[j + 1];
					arrayTmp[j + 1] = k;
				}
			}
		}
		array.setWorkArray(arrayTmp);
	}
}
