package main.java.by.mikshuta.task1.parser;

import java.util.List;
import java.util.ArrayList;

public class ArrayParser {
		
    public ArrayParser() {
    }
    
	public int[] parseStr(String str, char separator) {
        str = str.replaceAll("\\s", "");
        int[] arrInt;
        if (!str.isEmpty()) {
            String[] arrStr = str.split(Character.toString(separator));          
            arrInt = new int[arrStr.length];
            for (int i = 0; i < arrInt.length; i++) {
            	arrInt[i] = Integer.parseInt(arrStr[i]);
            }	
        } else {
            arrInt = new int[0];
        }
        return arrInt;
    }
	
	public List<int[]> parseListStr(List<String> strings, char separator) {
        List<int[]> listArrInt = new ArrayList<>();
        int[] arrInt;
        for (String str : strings) {
            arrInt = parseStr(str, separator);
            listArrInt.add(arrInt);
        }
        return listArrInt;
	}    
}
