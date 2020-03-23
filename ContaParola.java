package arrayEStringhe;

public class ContaParola 
{

	public static void main(String[] args)
	{
		String testo = "forza Roma, forza lupi, son finiti i tempi cupi";
		String parola = "forza";
		System.out.println("Le occorrenze della parola '" + parola + "' nel testo: '" + testo + "', sono: " + contaOccorrenze(testo, parola));
	}
	

	public static int contaOccorrenze(String testo, String parola)
	{
		int occorrenze = 0;
		String[] listaP = testo.split(" ");
		for(int i = 0; i< listaP.length; i++)
		{
			if (listaP[i].contentEquals(parola)) occorrenze++;
		}
		return occorrenze;
	}
	
}
