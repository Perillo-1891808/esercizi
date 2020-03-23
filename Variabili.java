package EserIniziali;

public class Variabili 
{

	public static void main(String[] args) 
	{
		int i;
		String s;
		double d;
		s = args[0];
		i = Integer.parseInt(s);
		d = i/2.0;
		System.out.println("Valore di s: " + s);
		System.out.println("Valore di i: " + i);
		System.out.print("Valore di d: " + d);
		
	}

}
