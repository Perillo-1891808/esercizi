package laboratorio11032020;

public class RegistratoreDiCassa 
{

	private double prezzoTot;
	private double totPagato;
	private double resto;
	
	
	public RegistratoreDiCassa() 
	{
		prezzoTot = 0;
	}
	
	public void registraPrezzo(double p)
	{
		prezzoTot += p;
	}
	
	public void registraImportoPagato(double i)
	{
		totPagato += i;
	}
	
	public double fineTransazione()
	{
		resto = totPagato-prezzoTot;
		if (resto > 0)
		{
			System.out.println("Il resto da dare al cliente e': " + resto + "€");
			return resto;
		}
		else
		{
			if(resto == 0)
			{
				System.out.println("Nessun resto da dare");
				return 0;
			}
			else
			{
				System.out.println("Il cliente deve ancora pagare :" + (resto*(-1)) + "€");
				return resto;
			}
		}
	}
	
	public static void main(String[] args)
	{
		RegistratoreDiCassa r = new RegistratoreDiCassa();
		r.registraPrezzo(20);
		r.registraPrezzo(30);
		r.registraImportoPagato(40);
		r.fineTransazione();
		r.registraImportoPagato(10);
		r.fineTransazione();
		r.registraImportoPagato(5.50);
		r.fineTransazione();
	}
}
