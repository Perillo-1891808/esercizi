package arrayEStringhe;

public class ReimplementazioneCopyAndToString 
{

	public static void main(String[] args) 
	{
		String[] arrayDiStringhe = new String[] {"ciao", "hello", "arrivederci"};
		int[] arrayDiNumeri = new int[] {1,2,3,4,5};
		System.out.println(toString(copyOf(arrayDiStringhe)));
		System.out.println(toString(copyOf(arrayDiNumeri)));
	}
	
	public static int[] copyOf(int[] array)
	{
		int[] nuovoArray = new int[array.length];
		for (int i = 0; i < array.length; i++)
		{
			nuovoArray[i] = array[i];
		}
		return nuovoArray;
	}
	
	public static String[] copyOf(String[] array)
	{
		String[] nuovoArray = new String[array.length];
		for (int i = 0; i < array.length; i++)
		{
			nuovoArray[i] = array[i];
		}
		return nuovoArray;
	}
	
	public static String toString(int[] array)
	{
		String stringaArray = "[";
		for (int i = 0; i < array.length; i++)
		{
			if(i < array.length-1) 
				stringaArray += array[i] + ", ";
			else
				stringaArray += array[i] + "]";
		}
		return stringaArray;
	}
	
	public static String toString(String[] array)
	{
		String stringaArray = "[";
		for (int i = 0; i < array.length; i++)
		{
			if(i < array.length-1) 
				stringaArray += array[i] + ", ";
			else
				stringaArray += array[i] + "]";
		}
		return stringaArray;
	}

}
