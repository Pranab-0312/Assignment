package com.imit.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Class_view {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> markList = new ArrayList<>();
		int option;
		boolean isRunning= true;
		while(isRunning) {
			System.out.println("Enter a number from below Option");
			System.out.println("1.Add another Mark");
			System.out.println("2.Find Average Mark");
			System.out.println("3.Quit");
			option=Integer.parseInt(sc.nextLine());
			switch(option) {
			case 1:
				System.out.println("Enter the mark");
				markList.add(Integer.parseInt(sc.nextLine()));
				break;
			case 2:
				float avgMark;
				int totalMarks=0;
				for(int i =0;i<markList.size();i++) {
					totalMarks+=markList.get(i);
				}
				avgMark= totalMarks/(float)markList.size();
				System.out.println("Average Mark is ="+avgMark);
				break;
			case 3:
				isRunning=false;
				System.out.println("Bye Bye !!!");
				//break;
			}
		}

	}

}
