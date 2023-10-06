package com.input;
import java.io.*;
public class ReadingFile {

	public static void main(String[] args) {
		try {
			File myFile=new File("Names.txt");
			BufferedReader br=new BufferedReader(new FileReader(myFile));
			String name=br.readLine();//name="FONCLARA, Melfred"
			String allNames="";//accumulator of all the lines
			while(name!=null) {
				allNames += name +"\n"; //allNames="FONCLARA, Melfred"
				name=br.readLine();
				
			}
			System.out.println(allNames);
		}
		catch(IOException err) {
			System.err.println("File not found.");
		}
	}

}
