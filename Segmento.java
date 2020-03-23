package laboratorio11032020;

public class Segmento 
{

	private Punto estremo1;
	private Punto estremo2;
	
	public Segmento(Punto p1, Punto p2) 
	{
		estremo1 = p1;
		estremo2 = p2;
	}
	
	public String toString()
	{
		return "(Estremo A: (" + estremo1.getX() + ", " + estremo1.getY() + ", " + estremo1.getZ() + "); Estremo B: (" + estremo2.getX() + ", " + estremo2.getY() + ", " + estremo2.getZ() + "))";
	}
}
