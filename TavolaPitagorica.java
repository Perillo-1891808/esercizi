package arrayEStringhe;

public class TavolaPitagorica 
{
	
	private String[][] tavola;

	public TavolaPitagorica(int N) 
	{
		tavola = new String[N+1][N+1];
		for(int i = 0; i <= N; i++)
		{
			for(int j = 0; j <= N; j++)
			{
				tavola[i][j] = String.valueOf(i*j);
			}
		}
	}
	
	public String getNumero(int i, int j)
	{
		return tavola[i][j];
	}
	
	public String toString()
	{
		String stringaTavola = "  X";
		for (int a = 0; a < tavola.length; a++)
		{
			switch(String.valueOf(a).length())
			{
				case 1: stringaTavola += "  "+ a; break;
				case 2: stringaTavola += " " + a; break;
				case 3: stringaTavola += a; break;
			}
			stringaTavola += " ";
		}
		stringaTavola += "\n";
		for(int i = 0; i < tavola.length; i++)
		{
			switch(String.valueOf(i).length())
			{
				case 1: stringaTavola += "  " + i; break;
				case 2: stringaTavola += " " + i; break;
				default: stringaTavola += i; break;
			}
			for(int j = 0; j < tavola.length; j++)
			{
				switch(tavola[i][j].length())
				{
					case 1: stringaTavola += "  "+ tavola[i][j]; break;
					case 2: stringaTavola += " " + tavola[i][j]; break;
					case 3: stringaTavola += tavola[i][j]; break;
				}
				if (j < tavola.length-1) stringaTavola += " ";
			}
			if (i < tavola.length-1) stringaTavola += "\n";
		}
		return stringaTavola;
	}

	public static void main(String[] args) 
	{
		var tavola = new TavolaPitagorica(10);
		System.out.println("Il numero nella posizione 5x4 e': " + tavola.getNumero(5, 4));
		System.out.println(tavola);
	}

}
