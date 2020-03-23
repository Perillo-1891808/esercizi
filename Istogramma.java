package arrayEStringhe;

import java.util.Arrays;

public class Istogramma 
{
	
	private String[] dati;
	private int[] valori;
	private int valoreMin;
	private int valoreMax;
	
	public Istogramma(int i, int j) 
	{
		valoreMin = i;
		valoreMax = j;
		dati = new String[0];
		valori = new int[0];
	}
	
	public void addDato(String dato)
	{
		dati = Arrays.copyOf(dati, dati.length+1);
		dati[dati.length-1] = dato;
		valori = Arrays.copyOf(valori, valori.length+1);
		valori[valori.length-1] = valoreMin;
	}
	
	public void incrementaConteggio(String elemento, int incremento)
	{
		boolean verifica = true;
		for (int i = 0; i < dati.length; i++)
			if(dati[i].equals(elemento))
			{
				verifica = false;
				if(valori[i] + incremento > valoreMax)
					System.out.println("L'incremento inserito e' eccessivo: " + valori[i] + "+" + incremento + " il valore del dato supera il limite inserito in precedenza(" + valoreMax + ")");
				else
					valori[i]+=incremento;
			}
			if(verifica) System.out.println("Il dato inserito non e' presente nell'istogramma");
	}
	
	public void stampaIstogrammaOrizzontale()
	{
		String[] copiaDati = Arrays.copyOf(adattamentoDati(), dati.length);
		System.out.println("ISTOGRAMMA DEI DATI INSERITI:");
		for (int i = 0; i < copiaDati.length; i++)
		{
			System.out.print(copiaDati[i] + ": ");
			for (int j = 0; j < valori[i]; j++) System.out.print("* ");
			System.out.println("");
		}
	}
	
	public void stampaIstogrammaVerticale()
	{
		String[] copiaDati = Arrays.copyOf(adattamentoDati(), dati.length);
		int lungMax = lungDatoMassima();
		int valMax = valoreMaggiore();
		char[][] stampaIsto = new char[lungMax+valMax][dati.length];
		System.out.println("ISTOGRAMMA DEI DATI INSERITI:");
		for(int i = 0; i < stampaIsto.length; i++)
		{
			for(int j = 0; j < dati.length; j++)
			{
				if(lungMax+valori[j] <= stampaIsto.length-1-i) stampaIsto[i][j] = ' ';
				else
				{
					if(lungMax <= stampaIsto.length-1-i) stampaIsto[i][j] = '*';
					else stampaIsto[i][j] = copiaDati[j].charAt(stampaIsto.length-1-i);
				}
			}
		}
		stampaIstoCompleto(stampaIsto);
	}
	
	private void stampaIstoCompleto(char[][]isto)
	{
		for(int i = 0; i < isto.length; i++)
		{
			for(int j = 0; j < isto[0].length; j++)
			{
				if (j < isto[0].length-1) System.out.print(isto[i][j] + " ");
				else System.out.println(isto[i][j]);
			}
		}
	}
	
	private int valoreMaggiore()
	{
		int valoreMax = 0;
		for (int i = 0; i < valori.length; i++)
			valoreMax = Math.max(valoreMax, valori[i]);
		return valoreMax;
	}
	
	private int lungDatoMassima()
	/* Funzione che supporta l'adattamento dei dati,
	 * calcolando la lunghezza massima dei dati.
	 */
	{
		int lungMax = 0;
		for (int i = 0; i < dati.length; i++)
			lungMax = Math.max(lungMax, dati[i].length());
		return lungMax;
	}
	
	private String[] adattamentoDati()
	/* Modifica i dati dell'array in modo tale che 
	 * siano tutti allineati quando si stamperà l'istogramma.
	 */
	{
		int lungMax = lungDatoMassima();
		String[] copiaDati = Arrays.copyOf(dati, dati.length);
		for (int i = 0; i < dati.length; i++)
			if(copiaDati[i].length() != lungMax)
				copiaDati[i] = " ".repeat(lungMax - copiaDati[i].length())  + copiaDati[i];
		return copiaDati;
	}
	
	public static void main(String[] args) 
	{
		var istogramma = new Istogramma(0,31);
		istogramma.addDato("Paolo Rossi");
		istogramma.addDato("Francesco Totti");
		istogramma.addDato("Stefan Radu");
		istogramma.addDato("Edin Dzeko");
		/* Verifica che quando si prova ad incrementare un dato non esistente, il programma lo comunichi e non esegua istruzioni. */
		istogramma.incrementaConteggio("non presente", 3);  
		istogramma.incrementaConteggio("Francesco Totti", 31);
		istogramma.incrementaConteggio("Stefan Radu", 0);
		istogramma.incrementaConteggio("Edin Dzeko", 25);
		istogramma.incrementaConteggio("Paolo Rossi", 20);
		/* Verifica che l'incremento non possa superare il limite j.  */
		istogramma.incrementaConteggio("Paolo Rossi", 12);
		istogramma.stampaIstogrammaOrizzontale();
		System.out.println("");
		System.out.println("");
		istogramma.stampaIstogrammaVerticale();
	}

}
