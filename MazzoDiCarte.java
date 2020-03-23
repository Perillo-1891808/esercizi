package arrayEStringhe;
import arrayEStringhe.Carta;

public class MazzoDiCarte 
{
	private int numeroCarta;
	private Carta[] mazzo = new Carta[52];
	public MazzoDiCarte() 
	{
		numeroCarta = 0;
		int conta = 0;
		for (int i = 1; i <= 13; i++)
		{
			switch (i)
			{
				case 1: 
					mazzo[conta++] = new Carta("Asso", "Picche");
					mazzo[conta++] = new Carta("Asso", "Quadri");
					mazzo[conta++] = new Carta("Asso", "Fiori");
					mazzo[conta++] = new Carta("Asso", "Cuori");
					break;
				case 2:
					mazzo[conta++] = new Carta("Due", "Picche");
					mazzo[conta++] = new Carta("Due", "Quadri");
					mazzo[conta++] = new Carta("Due", "Fiori");
					mazzo[conta++] = new Carta("Due", "Cuori");
					break;
				case 3: 
					mazzo[conta++] = new Carta("Tre", "Picche");
					mazzo[conta++] = new Carta("Tre", "Quadri");
					mazzo[conta++] = new Carta("Tre", "Fiori");
					mazzo[conta++] = new Carta("Tre", "Cuori");
					break;
				case 4:
					mazzo[conta++] = new Carta("Quattro", "Picche");
					mazzo[conta++] = new Carta("Quattro", "Quadri");
					mazzo[conta++] = new Carta("Quattro", "Fiori");
					mazzo[conta++] = new Carta("Quattro", "Cuori");
					break;
				case 5: 
					mazzo[conta++] = new Carta("Cinque", "Picche");
					mazzo[conta++] = new Carta("Cinque", "Quadri");
					mazzo[conta++] = new Carta("Cinque", "Fiori");
					mazzo[conta++] = new Carta("Cinque", "Cuori");
					break;
				case 6:
					mazzo[conta++] = new Carta("Sei", "Picche");
					mazzo[conta++] = new Carta("Sei", "Quadri");
					mazzo[conta++] = new Carta("Sei", "Fiori");
					mazzo[conta++] = new Carta("Sei", "Cuori");
					break;
				case 7: 
					mazzo[conta++] = new Carta("Sette", "Picche");
					mazzo[conta++] = new Carta("Sette", "Quadri");
					mazzo[conta++] = new Carta("Sette", "Fiori");
					mazzo[conta++] = new Carta("Sette", "Cuori");
					break;
				case 8:
					mazzo[conta++] = new Carta("Otto", "Picche");
					mazzo[conta++] = new Carta("Otto", "Quadri");
					mazzo[conta++] = new Carta("Otto", "Fiori");
					mazzo[conta++] = new Carta("Otto", "Cuori");
					break;
				case 9: 
					mazzo[conta++] = new Carta("Nove", "Picche");
					mazzo[conta++] = new Carta("Nove", "Quadri");
					mazzo[conta++] = new Carta("Nove", "Fiori");
					mazzo[conta++] = new Carta("Nove", "Cuori");
					break;
				case 10:
					mazzo[conta++] = new Carta("Dieci", "Picche");
					mazzo[conta++] = new Carta("Dieci", "Quadri");
					mazzo[conta++] = new Carta("Dieci", "Fiori");
					mazzo[conta++] = new Carta("Dieci", "Cuori");
					break;
				case 11: 
					mazzo[conta++] = new Carta("Jack", "Picche");
					mazzo[conta++] = new Carta("Jack", "Quadri");
					mazzo[conta++] = new Carta("Jack", "Fiori");
					mazzo[conta++] = new Carta("Jack", "Cuori");
					break;
				case 12:
					mazzo[conta++] = new Carta("Donna", "Picche");
					mazzo[conta++] = new Carta("Donna", "Quadri");
					mazzo[conta++] = new Carta("Donna", "Fiori");
					mazzo[conta++] = new Carta("Donna", "Cuori");
					break;
				case 13:
					mazzo[conta++] = new Carta("Kappa", "Picche");
					mazzo[conta++] = new Carta("Kappa", "Quadri");
					mazzo[conta++] = new Carta("Kappa", "Fiori");
					mazzo[conta++] = new Carta("Kappa", "Cuori");
					break;
			}
		}
		
	}
	
	public void mescola()
	{
		for(int i = 0; i < mazzo.length; i++)
		{
			int posCarta1 = (int)(Math.random()*mazzo.length);
			int posCarta2 = (int)(Math.random()*mazzo.length);
			Carta temporanea = mazzo[posCarta1];
			mazzo[posCarta1] = mazzo[posCarta2];
			mazzo[posCarta2] = temporanea;
		}
	}
	
	public Carta distribuisci()
	{
		Carta c = mazzo[numeroCarta++];
		if (numeroCarta == 52) numeroCarta = 0;
		return c;
	}

}
