package classiEOggetti;

public class Cerchio 
{
	private double raggio;
	
	
	
	public Cerchio(double r) 
	{
		raggio = r;
	}
	
	public double getCirconferenza()
	{
		return raggio*Math.PI;
	}
	
	public double getArea()
	{
	return Math.pow(raggio, 2)*Math.PI;
	}
	
	public static void main(String[] args)
	{
		Cerchio cer1 = new Cerchio(1);
		Cerchio cer2 = new Cerchio(5);
		System.out.println("Il valore della circonferenza del primo cerchio e': " + cer1.getCirconferenza());
		System.out.print("Il valore dell'area del secondo cerchio e': " + cer2.getArea());
	}
}
