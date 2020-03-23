package arrayEStringhe;
import arrayEStringhe.ScacchieraTris;

public class Tris 
{

	private ScacchieraTris scacchiera;
	
	public Tris() 
	{
		System.out.println("Inizio del gioco!");
		scacchiera = new ScacchieraTris();
	}
	
	public void setCasella(String segno, int i, int j)
	{
		scacchiera.setCasella(segno, i, j);
	}
	
	public ScacchieraTris mostraScacchiera()
	{
		return scacchiera;
	}
	
	

	public static void main(String[] args) 
	{
		Tris partita1 = new Tris();
		System.out.println(partita1.mostraScacchiera());
		System.out.println("---------------------"); /* Utilizzo quest'uotput per distinguere le varie tabelle nell'output.*/
		partita1.setCasella("O", 1, 1);
		partita1.setCasella("X", 0, 0);
		System.out.println(partita1.mostraScacchiera());
		System.out.println("---------------------");
		partita1.setCasella("O", 2, 2);
		partita1.setCasella("X", 0, 1);
		System.out.println(partita1.mostraScacchiera());
		System.out.println("---------------------");
		partita1.setCasella("O", 2, 1);
		partita1.setCasella("X", 0, 2);
		System.out.println(partita1.mostraScacchiera());
		System.out.println("---------------------");
	}

}
