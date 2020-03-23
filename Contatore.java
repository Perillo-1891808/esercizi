package classiEOggetti;

public class Contatore 
{
	private int contatore;
	
	
	public Contatore()
	{
		contatore = 0;
	}
	
	public Contatore(int val) 
	{
		contatore = val;
	}

	public void conta()
	{
		contatore ++;
	}
	
	public void decrementa()
	{
		contatore--;
	}
	
	public int getContatore()
	{
		return contatore;
	}
	
	public void resetContatore()
	{
		contatore = 0;
	}
	
	public void resetContatore(int reset)
	{
		contatore = reset;
	}
	
	public static void main(String[] args)
	{
		Contatore cont1 = new Contatore();
		Contatore cont2 = new Contatore(10);
		System.out.println("contatore1 inizializzato a: " + cont1.getContatore());
		System.out.println("contatore2 inizializzato a: " + cont2.getContatore());
		cont1.conta();
		cont1.conta();
		System.out.println("Valore del contatore1 dopo essere stato incrementato due volte: " + cont1.getContatore());
		cont1.decrementa();
		System.out.println("Valore del contatore1 dopo essere sato decrementato: " + cont1.getContatore());
		cont2.decrementa();
		cont2.decrementa();
		cont2.decrementa();
		System.out.println("Valore del contatore2 dopo essere stato decrementato: " + cont2.getContatore());
		
	}
}
