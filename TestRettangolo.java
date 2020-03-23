package classiEOggetti;
import classiEOggetti.Rettangolo;

public class TestRettangolo 
{

	public static void main(String[] args) 
	{
		/* Creazione rettangolo e output dei vertici iniziali del rettangolo */
		Rettangolo r = new Rettangolo(0, 0, 20, 10);
		System.out.println("Il vertice in alto a sx e in basso a dx del rettangolo hanno coordinate: " + r);
		/* "Traslazione" del rettangolo e outuput dei due nuovi vertici */
		r.trasla(10, 5);
		System.out.println("Le due nuove coordinte dei due vertici sono: " + r);
		/* Verifica del colore iniziale del rettangolo (nero) */
		System.out.println("Colore rettangolo: " + r.getColore());
		/* Prova del cambiamento del colore del rettangolo */
		r.setColore(100, 195, 234);
		System.out.println("Colore rettangolo: " + r.getColore());
		/* Setting del colore a bianco */
		r.setColore(255, 255, 255);
		System.out.println("Colore rettangolo: " + r.getColore());
		/* Verifica che la funzione rispetti il limite del valore dei colori (ovvero 255) */
		r.setColore(280, 10, 256);
		System.out.println("Colore rettangolo: " + r.getColore());
	}

}
