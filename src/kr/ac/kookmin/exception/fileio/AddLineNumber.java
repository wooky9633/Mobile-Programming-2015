package kr.ac.kookmin.exception.fileio;

import java.io.*;

public class AddLineNumber {

	public static void main(String[] args)
	{
		String a,b,c,d,e,f;
		
		try
		{
			BufferedReader inputStream = new BufferedReader(new FileReader("C://original.txt"));
			PrintWriter outputStream = new PrintWriter(new FileOutputStream("C://numbered.txt"));
			
			a = inputStream.readLine();
			b = inputStream.readLine();
			c = inputStream.readLine();
			d = inputStream.readLine();
			e = inputStream.readLine();
			f = inputStream.readLine();
			
			outputStream.println("1 "+ a);
			outputStream.println("2 "+ b);
			outputStream.println("3 "+ c);
			outputStream.println("4 "+ d);
			outputStream.println("5 "+ e);
			outputStream.println("6 "+ f);
			inputStream.close();
			outputStream.close();
		}
		
		catch(FileNotFoundException e1)
		{
			System.out.println("input.txt file does not exist.");
			e1.printStackTrace();
		}
		
		catch(IOException e1)
		{
			e1.printStackTrace();
		}
	}
}
