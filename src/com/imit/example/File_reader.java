package com.imit.example;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File_reader {

	public static void main(String[] args) throws IOException {
		File file= new File("C:\\Users\\prana\\eclipse-workspace\\Imit\\data_item");
		FileReader fr = new FileReader(file);
		int single;
		while((single = fr.read()) != -1) {
			System.out.print((char)single);
		}
		
		

	}

}
