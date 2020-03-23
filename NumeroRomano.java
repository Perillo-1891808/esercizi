package arrayEStringhe;

public class NumeroRomano 
{

	private int[] numeroRomano;
	
	
	public NumeroRomano(String numero) 
	{
		numeroRomano = new int[numero.length()];
		for (int i = 0; i<numeroRomano.length; i++)
		{
			switch(numero.charAt(i))
			{
				case 'M' -> numeroRomano[i] = 1000;
				case 'D' -> numeroRomano[i] = 500;
				case 'C' -> numeroRomano[i] = 100;
				case 'L' -> numeroRomano[i] = 50;
				case 'X' -> numeroRomano[i] = 10;
				case 'V' -> numeroRomano[i] = 5;
				case 'I' -> numeroRomano[i] = 1;
			}
		}
	}
	
	public int toInteger()
	{
		int numeroReale = numeroRomano[numeroRomano.length-1];
		for (int i = numeroRomano.length-2; i>=0; i--)
		{
			if(numeroRomano[i] < numeroRomano[i+1])
				numeroReale -= numeroRomano[i];
			else
				numeroReale += numeroRomano[i];
		}
		return numeroReale;
	}

	public static void main(String[] args) 
	{
		NumeroRomano numero = new NumeroRomano("MMXVIII");
		System.out.println("Il valore del numero romano e': " + numero.toInteger());
	}

}
