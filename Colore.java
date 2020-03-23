package classiEOggetti;

public class Colore 
{
	public int[] BIANCO = {255,255,255};
	public int[] NERO = {0,0,0};
	private int[] colore;
	
	
	public Colore()
	{
		colore = NERO;
	}
	
	public void modificaColore(int r, int g, int b) 
	{
		if (r == 255 && g == 255 && b == 255)
		{
			colore = BIANCO;
		}
		else
		{
			if (r > 255)
			{
				colore[0] = 255;
			}
			else
			{
				colore[0] = r;
			}
			if (g > 255)
			{
				colore[1] = 255;
			}
			else
			{
				colore[1] = g;
			}
			if (b > 255)
			{
				colore[2] = 255;
			}
			else
			{
				colore[2] = b;
			}
		}
	}
	
	public int[] restituisciColore()
	{
		return colore;
	}
}
