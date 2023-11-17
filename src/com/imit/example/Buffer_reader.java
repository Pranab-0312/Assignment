package com.imit.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Buffer_reader {

	public static void main(String[] args) throws IOException {
		File file= new File("C:\\Users\\prana\\eclipse-workspace\\Imit\\data_item");
		FileReader fr = new FileReader(file);
		String content= null;
		BufferedReader br = new BufferedReader(fr);
		while((content = br.readLine()) != null) {
			System.out.println(content);
			System.out.println(content.split(" ").length-1);
		}

	}

}
