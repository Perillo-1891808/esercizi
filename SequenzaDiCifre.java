package arrayEStringhe;

import java.util.Arrays;

public class SequenzaDiCifre 
{
	
	private int[] sequenza;

	public SequenzaDiCifre() 
	{
		sequenza = new int[0];
	}
	
	public void aggiungiCifre(String stringa, int N)
	{
		int conta = 0;
		for(int i = 0; i < stringa.length(); i++)
			if(Character.isDigit(stringa.charAt(i)))
			{
				conta ++;
				sequenza = Arrays.copyOf(sequenza, sequenza.length+1);
				sequenza[sequenza.length-1] = Integer.parseInt(stringa.substring(i, i+1));
				if(conta == N) break;
			}
	}
	
	public String toString()
	{
		String stampa = "[";
		for(int i = 0; i < sequenza.length; i++)
			if(i!= sequenza.length-1) stampa+= sequenza[i] + ", ";
			else stampa += sequenza[i] + "]";
		return stampa;
	}

	public static void main(String[] args) 
	{
		var s = new SequenzaDiCifre();
		s.aggiungiCifre("abc1--23", 2);
		s.aggiungiCifre("xx0a8b76543100",  4);
		System.out.println(s.toString());
	}

}
