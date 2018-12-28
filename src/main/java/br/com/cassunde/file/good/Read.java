package br.com.cassunde.file.good;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * This class read a file peoples.txt and execute any methods.
 * 
 * */
public class Read {

	public static void main(String[] args) {
		
		printTotalLines();
		printLinesGrouped();
	}
	
	private static void printTotalLines() {
		
		System.out.println("total of lines: "+ count());
	}
	
	private static void printLinesGrouped() {
		 
		for( String firstWord : groupingForAphabeticalOrder().keySet()) {
			
			System.out.println("Word: "+ firstWord + " total of names: "+ groupingForAphabeticalOrder().get(firstWord).size());
			System.out.println("----------------- names for: "+ firstWord);
		
			for(String name : groupingForAphabeticalOrder().get(firstWord)) {
			
				System.out.println(name);
			}
		}
	}
	
	/**
	 * 
	 * this method only count lines in file
	 * 
	 * */
	private static long count() {
		
		return readFile().count();
	}
	
	/**
	 * 
	 * This method is grouping list for first word and create a map with group created
	 * 
	 * */
	private static Map<String, List<String>> groupingForAphabeticalOrder() {
		
		return readFile().collect(Collectors.groupingBy( l -> l.toString().substring(0,1) ));
	}
	
	private static Stream<String> readFile(){
		
		try {
			
			Path path = Paths.get( ClassLoader.getSystemResource("peoples.txt").getFile());	
			return Files.lines(path);
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		return null;
	}
}
