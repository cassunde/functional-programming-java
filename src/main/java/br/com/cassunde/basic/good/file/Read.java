package br.com.cassunde.basic.good.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Read {

	public static void main(String[] args) {
		
		try {
			
			Path path = Paths.get( ClassLoader.getSystemResource("peoples.txt").getFile());	
			long total = Files.lines(path).count();
			System.out.println("total: " + total);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
