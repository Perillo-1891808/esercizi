package arrayEStringhe;

import java.util.Scanner;

public class CorniceIniziale 
{
	
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		System.out.println("Inserire la grandezza della cornice: ");		
		int num = input.nextInt();
		stampaCornice(num);
		
	}

	public static void stampaCornice(int n)
	{
		String cornice = "";
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				if (i == 1 || i == n)
				{
					cornice += "*";
				}
				else
				{
					if (j == 1 || j == n) 
						cornice += "*";
					else
						cornice += " ";
				}
			}
			if (i!=n) cornice += "\n";
		}
		System.out.println(cornice);
	}
}
