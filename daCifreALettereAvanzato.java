package arrayEStringhe;

public class daCifreALettereAvanzato 
{

	public static void main(String[] args) 
	{
		String prova = "1011";
		System.out.println(daCifreALettere(prova));

	}

	public static String daCifreALettere(String num)
	{
		switch(num.length())
		{
			case 3: 
				num = "0" + num;
				break;
			case 2:
				num = "00" + num;
				break;
			case 1:
				num = "000" + num;
				break;			
		}
		String[] letterale = new String[4];
		String[] listaN = num.split("");
		for (int i=listaN.length-1; i>=0; i--)
		{
			if(i == 3 && listaN[2].equals("1"))
			{
				String par = listaN[2] + listaN[3];
				switch(par)
				{
					case "10" -> letterale[3] = "dieci";
					case "11" -> letterale[3] = "undici";
					case "12" -> letterale[3] = "dodici";
					case "13" -> letterale[3] = "tredici";
					case "14" -> letterale[3] = "quattordici";
					case "15" -> letterale[3] = "quindici";
					case "16" -> letterale[3] = "sedici";
					case "17" -> letterale[3] = "diciassette";
					case "18" -> letterale[3] = "diciotto";
					case "19" -> letterale[3] = "diciannove";					
				}
				letterale[2] = " ";
			}
			else
			{
				switch(i)
				{
				case 3: 
					switch(listaN[i])
					{
						case "0" -> letterale[3] = " ";
						case "1" -> letterale[3] = "uno";
						case "2" -> letterale[3] = "due";
						case "3" -> letterale[3] = "tre";
						case "4" -> letterale[3] = "quattro";
						case "5" -> letterale[3] = "cinque";
						case "6" -> letterale[3] = "sei";
						case "7" -> letterale[3] = "sette";
						case "8" -> letterale[3] = "otto";
						case "9" -> letterale[3] = "nove";
					}
					break;
				case 2:
					switch(listaN[i])
					{
						case "0" -> letterale[2] = " ";
						case "2" -> letterale[2] = "venti";
						case "3" -> letterale[2] = "trenta";
						case "4" -> letterale[2] = "quaranta";
						case "5" -> letterale[2] = "cinquanta";
						case "6" -> letterale[2] = "sessanta";
						case "7" -> letterale[2] = "settanta";
						case "8" -> letterale[2] = "ottanta";
						case "9" -> letterale[2] = "novanta";
					}
					break;
				case 1:
					switch(listaN[i])
					{
						case "0" -> letterale[1] = " ";
						case "1" -> letterale[1] = "cento";
						case "2" -> letterale[1] = "duecento";
						case "3" -> letterale[1] = "trecento";
						case "4" -> letterale[1] = "quattrocento";
						case "5" -> letterale[1] = "cinquecento";
						case "6" -> letterale[1] = "seicento";
						case "7" -> letterale[1] = "settecento";
						case "8" -> letterale[1] = "ottocento";
						case "9" -> letterale[1] = "novecento";
					}
					break;
				case 0:
					switch(listaN[i])
					{
						case "0" -> letterale[0] = " ";
						case "1" -> letterale[0] = "mille";
						case "2" -> letterale[0] = "duemila";
						case "3" -> letterale[0] = "tremila";
						case "4" -> letterale[0] = "quattromila";
						case "5" -> letterale[0] = "cinquemila";
						case "6" -> letterale[0] = "seimila";
						case "7" -> letterale[0] = "settemila";
						case "8" -> letterale[0] = "ottomila";
						case "9" -> letterale[0] = "novemila";
					}
					break;
				}
			}
		}
		String numeroInLettere = "";
		for (int i = 0; i < 4; i++)
		{
			if (letterale[i] != " ")
			{
				numeroInLettere += letterale[i];
				if (i < 3) numeroInLettere += " ";
			}
		}
		return numeroInLettere;
	}
}
