package com.imit.ByteStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {
		File Studentdata= new File("./data/Students.txt");
		Studentdata.createNewFile();
		Student s = new Student();
		s.setFirstname("Pranab");
		s.setLastname("Dash");
		s.setBranch("Mca");
		s.setRollNo(59);
		s.setEmail("pk@test.com");
		FileOutputStream fos= new FileOutputStream(Studentdata);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.close();
		fos.close();
		
		

	}

}
