package main.java.by.mikshuta.task1.reader;

import main.java.by.mikshuta.task1.validator.ArrayValidator;
import main.java.by.mikshuta.task1.exception.ArrayException;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ArrayReader {
	
    public List<String> readFile(String fileName, char separator) throws ArrayException {
    	checkFile(fileName);
    	String str;    	
        List<String> strings = new ArrayList<>();       
        try {
        	BufferedReader buffReader = new BufferedReader(new FileReader(fileName));
            while (buffReader.ready()) {
                str = buffReader.readLine();
                ArrayValidator validator = new ArrayValidator();
                if (validator.isArrayLineValid(str, separator)) {
                    strings.add(str);
                }
            }
        } catch (IOException ioException) {        
            throw new ArrayException(ioException);
        }
        return strings;
    }
   
    private void checkFile(String fileName) throws ArrayException {
        if (fileName == null || fileName.isBlank()) {
            throw new ArrayException("Bad file name");
        }
        if (Files.notExists(Paths.get(fileName))) {
            throw new ArrayException("File '" + fileName + "' not exist");
        }
        if (!Files.isReadable(Paths.get(fileName))) {
            throw new ArrayException("File '" + fileName + "' is not readable");
        }       
    }   
}
