package classiEOggetti;
import classiEOggetti.Colore;

public class Rettangolo 
{
	private double x;
	private double y;
	private double altezza;
	private double lunghezza;
	private Colore col;
	
	
	
	public Rettangolo(double x, double y, double lung, double alt) 
	{
		this.x = x;
		this.y = y;
		altezza = alt;
		lunghezza = lung;
		col = new Colore();
	}
	
	public void trasla(double x, double y)
	{
		this.x += x;
		this.y += y;
	}
	
	public String toString()
	{
		return "("+x+","+y+")->("+(x+lunghezza)+","+(y+altezza)+")";
	}
	
	public void setColore(int r, int g, int b)
	{
		col.modificaColore(r, g, b);
	}
	
	public String getColore()
	{
		int[] listaCol = col.restituisciColore();
		return listaCol[0] + ", " + listaCol[1] + ", " + listaCol[2];
	}
}
