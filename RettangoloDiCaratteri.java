package arrayEStringhe;

public class RettangoloDiCaratteri 
{
	
	private int x;
	private int y;
	private int altezza;
	private int lunghezza;
	private char car1;
	private char car2;
	

	public RettangoloDiCaratteri(int x, int y, int lunghezza, int altezza) 
	{
		this.x = x;
		this.y = y;
		this.altezza = altezza;
		this.lunghezza = lunghezza;
		car1 = '*';
		car2 = '$';
	}
	
	public void draw()
	{
		String rettangolo = "";
		for (int i = 0; i < x+altezza; i++)
		{
			if (i < x) 
				rettangolo += "\n";
			else
			{
				for (int j = 0; j < y+lunghezza; j++)
					if (j<y) 
						rettangolo += ' ';
					else
						rettangolo += car1;
				if(i < x+altezza-1) rettangolo += "\n";
			}
		}
		System.out.println(rettangolo);
	}
	
	public void setCarattere(char car)
	{
		car1 = car;
	}
	
	public void drawVerticalStripes()
	{
		String rettangolo = "";
		for (int i = 0; i < x+altezza; i++)
		{
			if (i < x)
				rettangolo += "\n";
			else
			{
				for (int j = 0; j < y+lunghezza; j++)
					if (j<y)
					{
						rettangolo += ' ';
					}
					else
					{
						if (j%2 == 0) 
							rettangolo += car1;
						else 
							rettangolo += car2;
					}
				if(i < x+altezza-1) rettangolo += "\n";
			}
		}
		System.out.println(rettangolo);
	}
	
	public void drawHorizontalStripes()
	{
		String rettangolo = "";
		for (int i = 0; i < x+altezza; i++)
		{
			if (i < x)
				rettangolo += "\n";
			else
			{
				for (int j = 0; j < y+lunghezza; j++)
					if (j<y)
					{
						rettangolo += ' ';
					}
					else
					{
						if (i%2 == 0) 
							rettangolo += car1;
						else 
							rettangolo += car2;
					}
				if(i < x+altezza-1) rettangolo += "\n";
			}
		}
		System.out.println(rettangolo);
	}
	
	public void drawChessboard()
	{
		int scelta = 0;
		String rettangolo = "";
		for (int i = 0; i < x+altezza; i++)
		{
			if (i < x)
				rettangolo += "\n";
			else
			{
				for (int j = 0; j < y+lunghezza; j++)
					if (j<y)
					{
						rettangolo += ' ';
					}
					else
					{
						if (scelta%2 == 0 ) 
							rettangolo += car1;
						else 
							rettangolo += car2;
						scelta++;
					}
				if(lunghezza%2 == 0) scelta--;
				if(i < x+altezza-1) rettangolo += "\n";
			}
		}
		System.out.println(rettangolo);
	}
	
	public void setCarattere2(char c1, char c2)
	{
		car1 = c1;
		car2 = c2;
	}
	
	public void modificaPosizione(int newX, int newY)
	{
		x = newX;
		y = newY;
	}
	
	public char[] getCaratteriPerLaStampa()
	{
		return new char[] {car1, car2};
	}

	public static void main(String[] args) 
	{
		var rett = new RettangoloDiCaratteri(2,2,4,6);
		rett.draw();
		rett.setCarattere('#');
		rett.drawVerticalStripes();
		rett.drawHorizontalStripes();
		rett.drawChessboard();
		rett.setCarattere2('@', '+');
		rett.modificaPosizione(5, 5);
		rett.drawChessboard();
		char[] caratteri = rett.getCaratteriPerLaStampa();
		System.out.println("I due caratteri per la stampa sono: " + caratteri[0] + " " + caratteri[1]);
	}

}
