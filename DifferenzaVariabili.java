package EserIniziali;

public class DifferenzaVariabili
{

	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		double b = Double.parseDouble(args[1]);
		int c = (int)(a-b);
		System.out.print("La parte intera della differenza tra " + a + " e " + b + " e' " + c);
	}

}
