package arrayEStringhe;
import java.util.Scanner;

public class Divisore 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire il numero positivo di cui si vogliono stampare i divisori: ");
		int num = input.nextInt();
		divisoriN(num);
	}

	public static void divisoriN(int n)
	{
		String[] divisori;
		String div = "";
		for(int i = 1; i <= n/2; i++) 
			if(i%2 == 0) 
				div += i+" ";
		divisori = div.split(" ");
		for(int i = 0; i < divisori.length; i++)
		{
			if (i != divisori.length-1)
				System.out.print(divisori[i] + ", ");
			else
				System.out.println(divisori[i]);
		}
	}
}
