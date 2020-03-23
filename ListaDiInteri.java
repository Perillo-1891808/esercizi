package arrayEStringhe;

import java.util.Arrays;

public class ListaDiInteri 
{
	
	private int[] lista;

	public ListaDiInteri(int[] array) 
	{
		lista = Arrays.copyOf(array, array.length);
	}
	
	public int getEleInPos(int pos)
	{
		if(pos < lista.length) return lista[pos];
		else
		{
			System.out.println("L'indice non esiste");
			return -1;
		}
	}
	
	public int getIndiceEle(int k)
	{
		for(int i = 0; i < lista.length; i++)
			if(lista[i] == k) return i;
		System.out.println("L'elemento non e' presente nella lista");
		return -1;
	}
	
	public String stringaDellaLista()
	{
		String stampa = "[";
		for(int i = 0; i < lista.length; i++)
			if(i!= lista.length-1) stampa+= lista[i] + ", ";
			else stampa += lista[i] + "]";
		return stampa;
	}
	
	public int getLunghezzaLista()
	{
		return lista.length;
	}

	public boolean contieneIntero(int k)
	{
		for(int i = 0; i < lista.length; i++) if(lista[i] == k) return true;
		return false;
	}
	
	public void aggiungiInt(int k)
	{
		lista = Arrays.copyOf(lista, lista.length+1);
		lista[lista.length-1] = k;
	}
	
	public void aggiungiInt(int k, int pos)
	{
		if(pos < lista.length) 
		{
			if (pos == lista.length) aggiungiInt(k);
			else
			{
				int[] newLista = new int[lista.length+1];
				for(int i = 0; i < newLista.length; i++)
				{
					if(i < pos) newLista[i] = lista[i];
					else
					{
					if(i == pos) newLista[i] = k;
					else newLista[i] = lista[i-1];
					}
				}
				lista = Arrays.copyOf(newLista, newLista.length);
			}
		}
		else System.out.println("La posizione inserita supera la lunghezza della lista!");
	}
	
	public void eliminaPrimaOcc(int k)
	{
		int pos = getIndiceEle(k);
		if(pos != -1)
		{
			int[] newLista = new int[lista.length-1];
			for(int i = 0; i < lista.length; i++)
			{
				if (i < pos) newLista[i] = lista[i];
				if (i > pos) newLista[i-1] = lista[i];
			}
			lista = Arrays.copyOf(newLista, newLista.length);
		}
		else System.out.println("L'elemento non e' presente in lista");
	}
	
	public void eliminaEleInPos(int pos)
	{
		if(pos < lista.length) 
		{
			int[] newLista = new int[lista.length-1];
			for(int i = 0; i < lista.length; i++)
			{
				if (i < pos) newLista[i] = lista[i];
				if (i > pos) newLista[i-1] = lista[i];
			}
			lista = Arrays.copyOf(newLista, newLista.length);
		}
		else System.out.println("La posizione inserita supera la lunghezza della lista!");
	}
	
	public static void main(String[] args) 
	{
		var l = new ListaDiInteri(new int[]{0,1,3,4,5,6,7,8,9});
		System.out.println("L'elemento nella posizione 5 e': " + l.getEleInPos(5));
		System.out.println("L'indice del numero 4 e': " + l.getIndiceEle(4));
		System.out.println("La lista e': " + l.stringaDellaLista());
		System.out.println("La dimensione della lista e': " + l.getLunghezzaLista());
		System.out.println("La lista contiene il numero 6? " + l.contieneIntero(6));
		System.out.println("La lista contiene il numero 20? " + l.contieneIntero(10));
		l.aggiungiInt(10);
		System.out.println("La lista e': " + l.stringaDellaLista());
		l.aggiungiInt(2, 2);
		System.out.println("La lista e': " + l.stringaDellaLista());
		l.eliminaPrimaOcc(10);
		System.out.println("La lista e': " + l.stringaDellaLista());
		l.eliminaEleInPos(6);
		System.out.println("La lista e': " + l.stringaDellaLista());
	}

}
