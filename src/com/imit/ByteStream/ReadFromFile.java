package com.imit.ByteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFromFile {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File StudentData= new File("./data/Students.txt");
		FileInputStream fis = new FileInputStream(StudentData);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s=(Student)ois.readObject();
		System.out.println(s.getFirstname());
		System.out.println(s.getLastname());
		System.out.println(s.getEmail());
		System.out.println(s.getRollNo());

	}

}
