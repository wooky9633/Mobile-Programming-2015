package kc.ac.kookmin.exception.intro;

import java.io.*;

public class Trade {
	
	public void readFile()
	{
		BufferedReader BBB = null;
		
		try
		{
			String a;
			FileReader AAA = new FileReader("C://input.txt");
			BBB = new BufferedReader(AAA);
			a = BBB.readLine();
			System.out.println(a);
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("input.txt file does not exist.");
			e.printStackTrace();
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			try
			{
				if(BBB!=null)
				{
					BBB.close();
				}
				
				else
					System.out.println("file is not opened.");
			}
			
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
