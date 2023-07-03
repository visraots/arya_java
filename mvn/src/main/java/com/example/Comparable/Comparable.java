package com.example.Comparable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparable implements Comparator<List<String>> {
	public static void main(String[] args) {
	String csvFile = "/Users/aryavishnu/Downloads/Data.csv";
    String line = "";
    String cvsSplitBy = ",";
    List<List<String>> llp = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        while ((line = br.readLine()) != null) {
            llp.add(Arrays.asList(line.split(cvsSplitBy)));
        }
        
} catch (FileNotFoundException e) {
	
	e.printStackTrace();
} catch (IOException e) {
	
	e.printStackTrace();
}
}

	@Override
	public int compare(List<String> o1, List<String> o2) {
		return o1.get(1).compareTo(o2.get(1));
	}
}
