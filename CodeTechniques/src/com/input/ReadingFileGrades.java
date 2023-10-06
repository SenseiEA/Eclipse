package com.input;
import java.io.*;
public class ReadingFileGrades {

	public static void main(String[] args) {
		try {
			File myFile=new File("C:\\Eclipse\\Grades.csv");
			BufferedReader br=new BufferedReader(new FileReader(myFile));
			String grades=br.readLine();//grades="80,90,85"
			String allGrades="";//accumulator of all the lines
			while(grades!=null) {
				allGrades += grades +"\n";
				grades=br.readLine();
				
			}
			System.out.println(allGrades);
		}
		catch(IOException err) {
			System.err.println("File not found.");
		}
	}

}
