package EserIniziali;

public class AnnoBisestile
{

	public static void main(String[] args) 
	{
		int anno = Integer.parseInt(args[0]);
		boolean bBisestile = (anno % 4 == 0) && (anno % 100 != 0) || (anno % 400 == 0);
		System.out.println("L'anno " + anno + " e' bisestile? " + bBisestile);

	}

}
