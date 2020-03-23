package arrayEStringhe;

public class Carta 
{
	
	private final String seme;
	private final String valore;

	public Carta(String valore, String seme)
	{
		this.seme = seme;
		this.valore = valore;
	}
	
	public String toString()
	{
		return valore + " di " + seme;
	}

}
