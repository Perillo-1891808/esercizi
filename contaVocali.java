package arrayEStringhe;
import java.util.Scanner;

public class contaVocali 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire una stringa di cui si vogliono contare le vocali:");
		String stringa = input.nextLine();
		contaVoc(stringa);
	}
	
	public static void contaVoc(String stringa)
	{
		int[] listaVocali = {0,0,0,0,0};
		String[] listaP = stringa.split(" ");
		for(int i = 0; i < listaP.length; i++)
		{
			for(int j = 0; j < listaP[i].length(); j++)
			{
				switch(listaP[i].charAt(j))
				{
					case 'a' -> listaVocali[0]+=1;
					case 'e' -> listaVocali[1]+=1;
					case 'i' -> listaVocali[2]+=1;
					case 'o' -> listaVocali[3]+=1;
					case 'u' -> listaVocali[4]+=1;
				}
			}
		}
		System.out.print("a = " + listaVocali[0] + "  e = " + listaVocali[1] + "  i = " + listaVocali[2] + "  o = " + listaVocali[3] + "  u = " + listaVocali[4]);
	}
}
