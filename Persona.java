package classiEOggetti;

public class Persona 
{
	private String nome;
	private String cognome;
	
	
	
	public Persona(String n, String c)
	{
		/**
		 * Costruttore della Persona
		 */
		nome = n;
		cognome = c;
	}
	
	public void stampa()
	{
		System.out.println(nome + " " + cognome);
	}
	
	public static void main(String[] args)
	{
		Persona ragazzo = new Persona("Mario", "Rossi");
		ragazzo.stampa();
	}
}
