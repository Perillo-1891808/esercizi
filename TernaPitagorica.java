package arrayEStringhe;
import java.util.Scanner;

public class TernaPitagorica 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire il numero di cui si vogliono calcolare le terne pitagoriche");
		int NUM = input.nextInt();
		ternePitagoriche(NUM);
	}

	public static void ternePitagoriche(int N)
	{
		for (int a = 1; a<=N; a++)
		{
			for (int b = a; b<=N; b++)
			{
				for (int c = b; c<=N; c++)
				{
					if (a*a + b*b == c*c)
						System.out.println("a=" + a + " b=" + b + " c=" + c);
				}
			}
		}
	}
}
