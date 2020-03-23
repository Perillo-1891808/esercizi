package arrayEStringhe;
import java.util.Scanner;

public class CorniceAvanzata 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire la grandezza della cornice: ");		
		int grand = input.nextInt();
		
		/* Ho inserito questo input perché viene saltato in automatico in fase di compilazione.
		 * Senza quest'input verrebbe saltato l'input della frase da inserire nella cornice.
		 */
		String salto = input.nextLine();
		
		System.out.println("Inserire una frase da incorniciare(se la stringa e' piu' grande non verra' inserita completamente)");
		String frase = input.nextLine();
		fraseIncorniciata(grand, frase);		
	}

	public static void fraseIncorniciata(int n, String frase)
	{
		String cornice = "";
		int pos = 0;
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				if (i == 1 || i == n)
					cornice += "*";
				else
				{
					if (j == 1 || j == n) 
						cornice += "*";
					else
					{
						if (pos < frase.length())
						{
						cornice += frase.charAt(pos);
						pos += 1;
						}
						else cornice += " ";
					}
				}
			}
			if (i!=n) cornice += "\n";
		}
		System.out.println(cornice);
	}
}
