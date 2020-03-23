package arrayEStringhe;
import java.util.Scanner;

public class ConversioneNumeri 
{
	
	private int numero;
	
	
	public ConversioneNumeri(String num)
	{
		numero = Integer.parseInt(num);
	}
	
	public String binario()
	{
		int valore = numero;
		if(valore<0) valore *= -1;
		int resto;
		String numBinario = "";
		while(valore != 0)
		{
			resto = valore%2;
			valore /= 2;
			numBinario += resto;
		}
		if(numero<0)numBinario += " 1";
		else numBinario += " 0";
		String numConvertito = "";
		for(int i = numBinario.length() - 1; i>=0; i--)
		{			
			numConvertito += numBinario.charAt(i);
		}
		return numConvertito;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Inserire il numero da convertire: ");		
		String num = new Scanner(System.in).nextLine();
		var numero = new ConversioneNumeri(num);
		System.out.println("Conversione del numero in binario (modulo e segno): " + numero.binario());
		
	}
	
}
