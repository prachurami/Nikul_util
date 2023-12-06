package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {
		
	    //create a new file
		File f = new File("C:\\QA\\Testing\\temp.txt");
		f.createNewFile();
		
		//write into text file
		FileWriter fw = new FileWriter(f);
		BufferedWriter out = new BufferedWriter(fw);
		out.write("This is 1st Line");
		out.newLine();
		out.write("This is 2nd Line");
		out.newLine();
		out.write("This is 3rd Line");
		out.newLine();
		out.write("This is 4th Line");
		out.newLine();
		out.write("This is 5th Line");
		out.flush();

		//Read from text file
		FileReader r = new FileReader(f);
		BufferedReader rd = new BufferedReader(r);
		
		/*System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());*/
		
		String x;
		int i=0;
		while((x=rd.readLine())!=null) {
			System.out.println(x);
			i++;
		}
		System.out.println("Toltal Number of Lines:"+i);
	}

}
