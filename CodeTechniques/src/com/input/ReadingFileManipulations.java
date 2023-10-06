package com.input;
import java.io.*;
public class ReadingFileManipulations {

	public static void main(String[] args) {
		try {
			File myFile=new File("C:\\Eclipse\\FormatAssessment1.csv");
			BufferedReader br=new BufferedReader(new FileReader(myFile));
			String grade=br.readLine();//grades="84,85,100"
			String[] array= grade.split(",");
			String allGrades="";//accumulator of all the lines
			
			
			while(grade!=null) {
				allGrades += grade +"\n";//allGrades="84,85,100\n"
				
				array = grade.split(",");
				double grade1= Double.parseDouble((array[1]));
				double grade2= Double.parseDouble((array[2]));
				double grade3= Double.parseDouble((array[3]));
				double finalgr =(grade1 * 0.30)+ (grade2 * 0.30)+ (grade3 * 0.40);
				System.out.println("Name: " + array[0]);
				System.out.printf("Final Grade: %-10.2f", finalgr);
				System.out.println();
				grade=br.readLine();
				
			}
			System.out.println(allGrades);
		}
		catch(IOException err) {
			System.err.println("File not found.");
		}
	}

}