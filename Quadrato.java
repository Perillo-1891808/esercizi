package classiEOggetti;

public class Quadrato 
{
	private double lato;
	
	

	public Quadrato(double l) 
	{
		lato = l;
	}
	
	public double getPerimetro()
	{
		return lato*4;
	}
	
	public static void main(String[] args)
	{
		Quadrato q = new Quadrato(4);
		System.out.println("Il perimetro del quadrato e': " + q.getPerimetro());
	}
}
