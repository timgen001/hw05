package hw05_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class hw05_10 {
	public static void main(String[] args)
	{
		try
		{
			FileWriter fw = new FileWriter("test1.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			pw.println("Hello");
			pw.println("GoodBye");
			pw.close();
			System.out.println("資料已經入庫");
		}
		catch(IOException e)
		{
			System.out.println("輸出入有誤");
		}
	}

}

