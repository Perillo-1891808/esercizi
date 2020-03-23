package arrayEStringhe;

public class StringaVerticale 
{
	
	public static void main(String[] args)
	{
		String parola = args[0];
		strVert(parola);
	}
	
	public static void strVert(String parola)
	{
		String listaC[] = parola.split("");
		for(int i = 0; i<listaC.length; i++) System.out.println(listaC[i]);
	}
	
}
