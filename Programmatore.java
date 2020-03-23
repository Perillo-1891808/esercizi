package laboratorio11032020;

public class Programmatore 
{

	private String nome;
	private String cognome;
	private String azienda;
	private String linguaggio;
	
	public Programmatore(String nome, String cognome) 
	{
		this.cognome = nome;
		this.cognome = cognome;
	}

	public void setAzienda(String azienda)
	{
		this.azienda = azienda;
	}
	
	public void addLinguaggio(String ling)
	{
		if (linguaggio == null)
		{
			linguaggio = ling;
		}
		else
		{
			linguaggio += " " +  ling;
		}
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public String getCognome()
	{
		return cognome;
	}
	
	public String getAzienda()
	{
		return azienda;
	}

	public String getLinguaggi()
	{
		return linguaggio;
	}
	
	public static void main(String[] args)
	{
		Programmatore p1 = new Programmatore("Mario", "Rossi");
		Programmatore p2 = new Programmatore("Federico", "Fazio");
		Programmatore p3 = new Programmatore("Chris", "Smalling");
		
		p1.addLinguaggio("C");
		p1.addLinguaggio("C++");
		p1.setAzienda("Morgan Stanley");
		
		p2.addLinguaggio("C");
		p2.addLinguaggio("AWK");
		
		p3.addLinguaggio("Java");
		p3.setAzienda("Oracle");
		
		//stampa: Morgan Stanley
		System.out.println(p1.getAzienda());
		//stampa: C AWK
		System.out.println(p2.getLinguaggi());
	}
}
