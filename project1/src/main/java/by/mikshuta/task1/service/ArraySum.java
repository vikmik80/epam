package main.java.by.mikshuta.task1.service;

import main.java.by.mikshuta.task1.entity.WorkArray;
public class ArraySum {
	public ArraySum() {
	}
	public int searchSum(WorkArray array) {
		int[] arrayTmp = array.getWorkArray();
		int sum = 0;
		for (int i = 0; i <= arrayTmp.length - 1; i++) {
			sum += arrayTmp[i];
		}
		return sum;
	}
}
