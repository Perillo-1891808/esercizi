package arrayEStringhe;

public class EserBaseArray 
{

	public static void main(String[] args) 
	{
		String[] arrayS = {"ciao", "hello", "bella"};
		String prova1 = "ciao";
		String prova2 = "non presente";
		if(contieneStringa(arrayS, prova1))
			System.out.println("La stringa '" + prova1 + "' e' presente");
		else
			System.out.println("La stringa '" + prova1 + "' non e' presente");
		if(contieneStringa(arrayS, prova2))
			System.out.println("La stringa '" + prova2 + "' e' presente");
		else
			System.out.println("La stringa '" + prova2 + "' non e' presente");
		System.out.println("La stringa "+prova1 + " si trova in posizione: " + posizioneStringa(arrayS, prova1));
		System.out.println("La stringa "+prova2 + " si trova in posizione: " + posizioneStringa(arrayS, prova2));
		double[] arrayD = {0.1, 0.2, 0.4, 5.467, 5.470};
		System.out.println("Il valore massimo e': " + valoreMassimo(arrayD));
	}
	
	public static boolean contieneStringa(String[] arrayS, String parola)
	{
		for (int i = 0; i<arrayS.length; i++) if (arrayS[i].equals(parola)) return true;
		return false;
	}
	
	public static int posizioneStringa(String[] arrayS, String parola)
	{
		for (int i = 0; i<arrayS.length; i++) if (arrayS[i].equals(parola)) return i;
		return -1;
	}
	
	public static double valoreMassimo(double[] arrayD)
	{
		double valoreMax = arrayD[0];
		for (int i = 1; i < arrayD.length; i++) valoreMax = Math.max(valoreMax, arrayD[i]);
		return valoreMax;
	}
}
