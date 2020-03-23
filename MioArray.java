package arrayEStringhe;

import java.util.Arrays;

public class MioArray 
{
	
	private int[]array;

	
	public MioArray(int[]array)
	{
		this.array = Arrays.copyOf(array, array.length);
	}
	
	public boolean contiene(int pos, int num)
	{
		if(array[pos] == num) 
			return true;
		else 
			return false;
	}
	
	public int somma2()
	{
		switch(array.length)
		{
			case 0: return 0;
			case 1: return array[0];
			default: return array[0]+array[1];
		}
		
	}
	
	public void scambia(int pos1, int pos2)
	{
		int temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;
	}
	
	public int maxTripla()
	{
		int valoreMax = array[0];
		if (array.length%2 == 0)
		{
			valoreMax = Math.max(valoreMax, array[array.length/2]);
			valoreMax = Math.max(valoreMax, array[array.length/2-1]);
			valoreMax = Math.max(valoreMax, array[array.length-1]);
		}
		else
		{
			valoreMax = Math.max(valoreMax, array[array.length/2]);
			valoreMax = Math.max(valoreMax, array[array.length-1]);
		}
		return valoreMax;
	}
	
	public int[] falloInDue()
	{
		return new int[]{array[0], array[array.length-1]};					
	}
	
	public static void main(String[] args) 
	{
		MioArray array = new MioArray(new int[] {1,2,4,8,45,67,34,12});
		if(array.contiene(2, 4))
			System.out.println("L'elemento si trova in quella posizione");
		else
			System.out.println("L'elemento non si trova in quella posizione");
		System.out.println("La somma dei primi due elementi dell'array e': " + array.somma2());
		array.scambia(4, 5);
		System.out.println("Il valore max tra il primo, l'ultimo e quello intermedio e': " + array.maxTripla());
		int num1 = array.falloInDue()[0];
		int num2 = array.falloInDue()[1];
		System.out.println("[" + num1 + ", " + num2 + "]");
	}
	

}
