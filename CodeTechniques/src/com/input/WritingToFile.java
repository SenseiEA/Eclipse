package com.input;
import java.io.*;
public class WritingToFile {
	public static void main(String[] args) {
		try {
			File myFile=new File("Names.txt");
			PrintWriter pw=new PrintWriter(new FileWriter(myFile,true));
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter name to add: ");
			String name=br.readLine();
			pw.println(name);
			pw.close();
			
			
			BufferedReader br2=new BufferedReader(new FileReader(myFile));
			String allNames="These are the list of names:\n";
			String names=br2.readLine();
			while(names!=null) {
				allNames+=names+"\n";
				names=br2.readLine();
			}
			System.out.println(allNames);
			br2.close();
			
		}
		catch(IOException err) {
			System.err.println(err.getMessage());
		}
	}

}
