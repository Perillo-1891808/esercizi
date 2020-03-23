package arrayEStringhe;

public class FrasePalindroma 
{

	public static void main(String[] args) 
	{
		String test1 = "angelalavalalegna";
		String test2 = "itopinonavevanonipoti";
		String test3 = "testsbagliato";
		String test4 = "a";
		String test5 = "ao";
		String test6 = "aa";
		frasePalindroma(test1);
		frasePalindroma(test2);
		frasePalindroma(test3);
		frasePalindroma(test4);
		frasePalindroma(test5);
		frasePalindroma(test6);
	}
	
	public static void frasePalindroma(String frase)
	{
		boolean verifica = true;
		while(frase.length() > 1)
		{
			if (frase.charAt(0) == frase.charAt(frase.length()-1))
			{
				frase = frase.substring(1, frase.length()-1);
			}
			else
			{
				verifica = false; 
				break;
			}
		}
		if (verifica)
		{
			System.out.println("La frase e' palindroma");
		}
		else
		{
			System.out.println("La frase non e' palindroma");
		}
	}

}
