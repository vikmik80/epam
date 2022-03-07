package main.java.by.mikshuta.task1.service;

import main.java.by.mikshuta.task1.entity.WorkArray;

public class ArraySort {
	
	public ArraySort() {
	}
	
	public void sortBubble(WorkArray array) {
		int[] arrayTmp = array.getWorkArray();
		int k;
		boolean sort = true;
		while (sort) {
       		sort = false;
        	for (int i = 1; i < arrayTmp.length; i++) {
	    		for (int j = 0; j < arrayTmp.length - i; j++) {
		    		if (arrayTmp[j] > arrayTmp[j + 1]) {
		    			k = arrayTmp[j];
		    			arrayTmp[j] = arrayTmp[j + 1];
		    			arrayTmp[j + 1] = k;
		    			sort = true;
		    		}
	    		}
        	}
       	}
		array.setWorkArray(arrayTmp);
	}
	
	public void sortShaker(WorkArray array) {
		int[] arrayTmp = array.getWorkArray();
		int k;		
		int begArr = 0;
		int endArr = arrayTmp.length - 1;
		while (endArr > begArr) {
			for (int i = begArr; i < endArr; i++) {
				if (arrayTmp[i] > arrayTmp[i + 1]) {
					k = arrayTmp[i];
					arrayTmp[i] = arrayTmp[i + 1];
					arrayTmp[i + 1] = k;
				}
			}			
			endArr--;
			for (int i = endArr; i > begArr; i--) {
				if (arrayTmp[i] < arrayTmp[i - 1]) {
					k = arrayTmp[i];
					arrayTmp[i] = arrayTmp[i - 1];
					arrayTmp[i - 1] = k;
				}
			}
			begArr++;
		}
		array.setWorkArray(arrayTmp);
	}
	
	public void sortComb(WorkArray array) { 
		int[] arrayTmp = array.getWorkArray();
		int k = 0;
       	int step = arrayTmp.length - 1;
       	double index = 1.2473309;
       	boolean sort = true;
       	while (step > 1) {
       		for (int i = 0; i + step < arrayTmp.length; i++) {
       			if (arrayTmp[i] > arrayTmp[i + step])
       				k = arrayTmp[i];
       			    arrayTmp[i] = arrayTmp[i + step];
				    arrayTmp[i + step] = k;
       		}
       		step /= index;
        } 
       	while (sort) {
       		sort = false;
        	for (int i = 1; i < arrayTmp.length; i++) {
	    		for (int j = 0; j < arrayTmp.length - i; j++) {
		    		if (arrayTmp[j] > arrayTmp[j + 1]) {
		    			k = arrayTmp[j];
		    			arrayTmp[j] = arrayTmp[j + 1];
		    			arrayTmp[j + 1] = k;
		    			sort = true;
		    		}
	    		}
        	}
       	}
		array.setWorkArray(arrayTmp);       	
	}
}        	
	
