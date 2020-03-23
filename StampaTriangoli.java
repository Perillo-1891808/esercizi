package arrayEStringhe;
import java.util.Scanner;

public class StampaTriangoli 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire la lunghezza della base del triangolo isoscele: ");		
		int N = input.nextInt();
		generaTriangolo(N);
	}
	
	public static void generaTriangolo(int N)
	{
		String triangolo = "";
		int counter = 1;
		String livello;
		for (int i=0; i<N/2+1; i++)
		{
			livello = "*".repeat(counter);
			counter++;
			counter++;
			while(livello.length() != N)
			{
				livello = " " + livello + " ";
			}
			triangolo += livello;
			if (counter <= N)
			{
				triangolo+="\n";
			}
		}
		System.out.println(triangolo);
	}

}
