package arrayEStringhe;
import java.util.Scanner;

public class SommaNumeriPrecedenti 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire il numero a: ");		
		int a = input.nextInt();
		System.out.println("Inserire il numero b: ");		
		int b = input.nextInt();
		System.out.println("Inserire il numero N: ");		
		int N = input.nextInt();
		stampaSommaNumPrec(a,b,N);
	}
	
	public static void stampaSommaNumPrec(int a, int b, int N)
	{
		int[] numeri = new int[a+b+N];
		numeri[0] = a;
		numeri[1] = b;
		System.out.print(a + ", " + b + ", ");
		for(int i = 2; i <= N+1; i++)
		{
			numeri[i] = numeri[i-2] + numeri[i-1];
			if (i <= N)
				System.out.print(numeri[i] + ", ");
			else
				System.out.println(numeri[i]);
		}
	}

}
