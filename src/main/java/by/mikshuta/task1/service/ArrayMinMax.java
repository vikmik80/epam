package main.java.by.mikshuta.task1.service;

import main.java.by.mikshuta.task1.entity.WorkArray;

public class ArrayMinMax {
	
	public ArrayMinMax() {
	}
	
	public int searchMin(WorkArray array) {
		int[] arrayTmp = array.getWorkArray();
		int min = arrayTmp[0];
		for (int i = 1; i <= arrayTmp.length - 1; i++) {
			if (arrayTmp[i] < min) {
				min = arrayTmp[i];
			}
		}
		return min;
	}
	
	public int searchMax(WorkArray array) {
		int[] arrayTmp = array.getWorkArray();
		int max = arrayTmp[0];
		for (int i = 1; i <= arrayTmp.length - 1; i++) {
			if (arrayTmp[i] > max) {
				max = arrayTmp[i];
			}
		}
		return max;
	}
}
