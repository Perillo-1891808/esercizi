package arrayEStringhe;

public class Cornice
{

	private String cornice;
	
	public Cornice(int n)
	{
		cornice = "";
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				if (i == 1 || i == n)
				{
					cornice += "*";
				}
				else
				{
					if (j == 1 || j == n) 
						cornice += "*";
					else
						cornice += " ";
				}
			}
			if (i!=n) cornice += "\n";
		}
	}
	
	public Cornice(int n, String frase) 
	{
		cornice = "";
		int pos = 0;
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				if (i == 1 || i == n)
					cornice += "*";
				else
				{
					if (j == 1 || j == n) 
						cornice += "*";
					else
					{
						if (pos < frase.length())
						{
						cornice += frase.charAt(pos);
						pos += 1;
						}
						else cornice += " ";
					}
				}
			}
			if (i!=n) cornice += "\n";
		}
	}
	
	public String toString()
	{
		return cornice;
	}
	

	public static void main(String[] args) 
	{	
		Cornice c1 = new Cornice(6);
		System.out.println(c1);
		Cornice c2 = new Cornice(6, "Cornici in java");
		System.out.println(c2);
	}
}
