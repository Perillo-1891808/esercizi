package arrayEStringhe;

public class ScacchieraTris 
{
	
	private String[][] scacchiera = new String[3][3];

	public ScacchieraTris() 
	{
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				scacchiera[i][j] = " ";
			}
		}
	}
	
	public void setCasella(String simbolo, int i, int j)
	{
		if (scacchiera[i][j].equals(" "))
			scacchiera[i][j] = simbolo;
		else
			System.out.println("Posizione gia' occupata!");
		
		/*
		 * Qui' controllo se il giocatore che ha messo l'ultimo simbolo ha vinto.
		 * Per leggibilita' e comodita' lo verifico attraverso piu' if, 
		 * nonostante si possa fare con un singolo if.
		 */
		if(scacchiera[0][0].equals(simbolo) && scacchiera[0][1].equals(simbolo) && scacchiera[0][2].equals(simbolo))
			System.out.println(simbolo + " hai vinto!");
		if(scacchiera[0][0].equals(simbolo) && scacchiera[1][0].equals(simbolo) && scacchiera[2][0].equals(simbolo))
			System.out.println(simbolo + " hai vinto!");
		if(scacchiera[2][0].equals(simbolo) && scacchiera[2][1].equals(simbolo) && scacchiera[2][2].equals(simbolo))
			System.out.println(simbolo + " hai vinto!");
		if(scacchiera[0][2].equals(simbolo) && scacchiera[1][2].equals(simbolo) && scacchiera[2][2].equals(simbolo))
			System.out.println(simbolo + " hai vinto!");
		if(scacchiera[0][0].equals(simbolo) && scacchiera[1][1].equals(simbolo) && scacchiera[1][1].equals(simbolo))
			System.out.println(simbolo + " hai vinto!");
		if(scacchiera[0][2].equals(simbolo) && scacchiera[1][1].equals(simbolo) && scacchiera[2][0].equals(simbolo))
			System.out.println(simbolo + " hai vinto!");
	}
	
	public String toString()
	{
		String stringaScacchiera = "";
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				stringaScacchiera += scacchiera[i][j];
				if (j < 2) stringaScacchiera += " ";
			}
			if (i < 2) stringaScacchiera += "\n";
		}
		return stringaScacchiera;
	}

}
