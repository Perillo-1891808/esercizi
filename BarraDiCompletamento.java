package classiEOggetti;

public class BarraDiCompletamento 
{
	private double percentuale;
	
	
	public BarraDiCompletamento(double perc) 
	{
		percentuale = perc;
	}
	
	public void incrementa(double i)
	{
		percentuale += i;
	}
	
	public String toString()
	{
		return Math.round(percentuale)+"%";
	}
	
	public static void main(String[] args)
	{
		BarraDiCompletamento barra = new BarraDiCompletamento(0);
		barra.incrementa(20);
		barra.incrementa(25);
		System.out.print("La barra di completamento si trova al: " + barra);
	}
}
