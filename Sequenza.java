package arrayEStringhe;

import java.util.Arrays;

public class Sequenza 
{
	
	private int array[];

	public Sequenza(int[] array) 
	{
		this.array = Arrays.copyOf(array, array.length);
	}
	
	public int[] getMediana() 
	{
		int[] arrayOrdinato = Arrays.copyOf(array, array.length);
		Arrays.sort(arrayOrdinato);
		return arrayOrdinato;
	}
	
	public int getMedia()
	{
		int somma = 0;
		for (int i = 0; i < array.length; i++)
		{
			somma += array[i];
		}
		return somma/array.length;
	}
	
	public int getModa()
	{
		int massimo = 0;
		int [] arrayOccorrenze = new int[array.length];
		for (int i = 0; i < array.length; i ++)
		{
			for(int j = 0; j < array.length; j++)
				if(array[i] == array[j])
					arrayOccorrenze[i] += 1;
			massimo = Math.max(massimo, arrayOccorrenze[i]);
		}
		return array[Arrays.binarySearch(arrayOccorrenze, massimo)];
	}

	public static void main(String[] args) 
	{
		var array = new Sequenza(new int[]{1,2,3,4,5,6,7,8,9,3,4,32,2,2,2,2});
		int[] a = Arrays.copyOf(array.getMediana(), array.getMediana().length);
		System.out.print("[");
		for (int i = 0; i < a.length; i++)
			if(i < a.length-1)
				System.out.print(a[i] + ", ");
			else
				System.out.println(a[i]+"]");
		System.out.println("La media dei valori dell'array e': " + array.getMedia());
		System.out.println("L'elemento che si ripete piu' volte nell'array e': " + array.getModa());
	}

}
