package EserIniziali;

public class PhraseOMatic 
{

	public static void main(String[] args) 
	{
		String[] l1 = {"salve", "ciao", "hello", "buongiorno", "scialla"};
		String[] l2 = {"egregio", "eclettico", "intelligentissimo", "astutissimo"};
		String[] l3 = {"studente", "ragazzo", "giovane", "scapestrato", "fannullone", "studioso"};
		double r = Math.random();
		int i1 = (int)(r*l1.length);
		int i2 = (int)(r*l2.length);
		int i3 = (int)(r*l3.length);
		System.out.print(l1[i1] + " " + l2[i2] + " " + l3[i3]);
	}

}
