package arrayEStringhe;

import java.util.Arrays;

public class Filtro 
{
	
	private int[] array;

	public Filtro(int [] array) 
	{
		this.array = Arrays.copyOf(array, array.length);
	}
	
	public int[] passaBasso(int k)
	{
		int conta = 0;
		for(int i = 0; i<array.length; i++) if(array[i] <= k) conta++;
		int[] newArray = new int[conta];
		conta = 0;
		for(int i = 0; i<array.length; i++) if(array[i] <= k) newArray[conta++] = array[i];
		return newArray;
	}
	
	public int[] passaAlto(int k)
	{
		int conta = 0;
		for(int i = 0; i<array.length; i++) if(array[i] >= k) conta++;
		int[] newArray = new int[conta];
		conta = 0;
		for(int i = 0; i<array.length; i++) if(array[i] >= k) newArray[conta++] = array[i];
		return newArray;
	}
	
	public int[] filtra(int k)
	{
		int conta = 0;
		for(int i = 0; i<array.length; i++) if(array[i] != k) conta++;
		int[] newArray = new int[conta];
		conta = 0;
		for(int i = 0; i<array.length; i++) if(array[i] != k) newArray[conta++] = array[i];
		return newArray;
	}
	
	public int[] filtra(int[]arrayFiltro)
	{
		int[] indiciDaRim = new int[0];
		for(int i = 0; i<arrayFiltro.length; i++)
			for(int j = 0; j<array.length; j++)
				if(arrayFiltro[i] == array[j]) 
				{
					indiciDaRim = Arrays.copyOf(indiciDaRim, indiciDaRim.length+1);
					indiciDaRim[indiciDaRim.length-1] = j;
				}
		int[] arrayFinale = new int[array.length-indiciDaRim.length];
		int pos = 0;
		boolean ver;
		for(int i = 0; i<array.length; i++)
		{
			ver = true;
			for(int j = 0; j<indiciDaRim.length; j++)
				if (indiciDaRim[j] == i) ver = false;
			if(ver) arrayFinale[pos++] = array[i];
		}
		return arrayFinale;	
	}

	public static void main(String[] args) 
	{
		var array = new Filtro(new int[] {1,2,10,2,42,7,8});
		/* 
		 * Test della funzione passaBasso 
		*/
		int[] provaBasso = Arrays.copyOf(array.passaBasso(8), array.passaBasso(8).length);
		System.out.print("Test della funzione passaBasso:" + "{");
		for (int i = 0; i<provaBasso.length; i++)
		{
			if(i != provaBasso.length-1) System.out.print(provaBasso[i] + ", ");
			else System.out.println(provaBasso[i] + "}");
		}
		/* 
		 * Test della funzione passaAlto 
		*/
		int[] provaAlto = Arrays.copyOf(array.passaAlto(9), array.passaAlto(9).length);
		System.out.print("Test della funzione passaAlto:" + "{");
		for (int i = 0; i<provaAlto.length; i++)
		{
			if(i != provaAlto.length-1) System.out.print(provaAlto[i] + ", ");
			else System.out.println(provaAlto[i] + "}");
		}
		/* 
		 * Test della funzione filtra(int k)
		*/
		int[] provaFiltraK = Arrays.copyOf(array.filtra(2), array.filtra(2).length);
		System.out.print("Test della funzione filtra(k):" + "{");
		for (int i = 0; i<provaFiltraK.length; i++)
		{
			if(i != provaFiltraK.length-1) System.out.print(provaFiltraK[i] + ", ");
			else System.out.println(provaFiltraK[i] + "}");
		}
		/* 
		 * Test della funzione filtra(int[] array)
		*/
		int[] provaFiltraArray = Arrays.copyOf(array.filtra(new int[] {2,7,42}), array.filtra(new int[] {2,7,42}).length);
		System.out.print("Test della funzione filtra(int[] array):" + "{");
		for (int i = 0; i<provaFiltraArray.length; i++)
		{
			if(i != provaFiltraArray.length-1) System.out.print(provaFiltraArray[i] + ", ");
			else System.out.println(provaFiltraArray[i] + "}");
		}
	}
}
