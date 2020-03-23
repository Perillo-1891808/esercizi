package arrayEStringhe;

public class StringheVerticali 
{

	public static void main(String[] args) 
	{
		String parola1 = "ciao";
		String parola2 = "buondi";
		String parola3 = "hello";
		stampa(parola1, parola2, parola3);

	}

	public static void stampa(String par1, String par2, String par3)
	{
		int maxL = Math.max(par1.length(), par2.length());
		maxL = Math.max(maxL, par3.length());
		String listaP[] = {par1, par2, par3};
		String output = "";
		for (int i=0; i<maxL; i++)
		{
			for (int j=0; j<listaP.length; j++)
			{
				if (i<listaP[j].length()) output += listaP[j].charAt(i);
				else output += " ";
			}
			if (i != maxL-1) output += "\n";
		}
		System.out.print(output);
	}
}
