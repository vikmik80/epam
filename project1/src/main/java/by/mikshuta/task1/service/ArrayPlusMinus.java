package main.java.by.mikshuta.task1.service;

import main.java.by.mikshuta.task1.entity.WorkArray;
public class ArrayPlusMinus {
	public ArrayPlusMinus() {
	}
	public int searchPlus(WorkArray array) {
		int[] arrayTmp = array.getWorkArray();
		int count = 0;
		for (int i = 0; i <= arrayTmp.length - 1; i++) {
			if (arrayTmp[i] > 0) {
				count++;
			}
		}	
		return count;
	}
	public int searchMinus(WorkArray array) {
		int[] arrayTmp = array.getWorkArray();
		int count = 0;
		for (int i = 0; i <= arrayTmp.length - 1; i++) {
			if (arrayTmp[i] < 0) {
				count++;
			}
		}	
		return count;
	}
}
