package arrayEStringhe;
import arrayEStringhe.MazzoDiCarte;

public class CollaudoMazzoDiCarte 
{

	public static void main(String[] args) 
	{
		var mazzo = new MazzoDiCarte();
		mazzo.mescola();
		for (int i = 0; i < 52; i++) System.out.println(mazzo.distribuisci());		
	}

}
