package arrayEStringhe;

public class DaCifreALettere 
{

	public static void main(String[] args) 
	{
		String prova1 = "8452";
		System.out.println(daCifreALettere(prova1));
		String prova2 = "uno nove due sette";
		System.out.println(daLettereACifre(prova2));
	}
	
	public static String daCifreALettere(String n)
	{
		String letterale = "";
		String[] listaC = n.split("");
		for (int i=0; i<listaC.length; i++)
		{
			switch(listaC[i])
			{
				case "0" -> letterale += "zero";
				case "1" -> letterale += "uno";
				case "2" -> letterale += "due";
				case "3" -> letterale += "tre";
				case "4" -> letterale += "quattro";
				case "5" -> letterale += "cinque";
				case "6" -> letterale += "sei";
				case "7" -> letterale += "sette";
				case "8" -> letterale += "otto";
				case "9" -> letterale += "nove";
			}
			if(i < listaC.length-1)
				letterale += " ";
		}
		return letterale;
	}
	
	public static String daLettereACifre(String let)
	{
		String numero = "";
		String[] listaNum = let.split(" ");
		for (int i=0; i<listaNum.length; i++)
		{
			switch(listaNum[i])
			{
				case "zero" -> numero += "0";
				case "uno" -> numero += "1";
				case "due" -> numero += "2";
				case "tre" -> numero += "3";
				case "quattro" -> numero += "4";
				case "cinque" -> numero += "5";
				case "sei" -> numero += "6";
				case "sette" -> numero += "7";
				case "otto" -> numero += "8";
				case "nove" -> numero += "9";
			}
		}
		return numero;
	}

}
