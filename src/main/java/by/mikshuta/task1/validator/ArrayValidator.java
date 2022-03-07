package main.java.by.mikshuta.task1.validator;

public class ArrayValidator {

    public ArrayValidator() {
    }

    public boolean isArrayLineValid(String str, char separator) {
    	String regEx = "\\s*-?\\d+(\\s*" + Character.toString(separator) + "\\s*-?\\d+)*\\s*";
    	boolean ok = str != null && (str.isBlank() || str.matches(regEx));
    	return ok;
    }
}