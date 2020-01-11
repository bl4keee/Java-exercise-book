package Pliki_o_dostêpie_swobodnym;
import java.io.IOException;
import java.io.RandomAccessFile;

public class File1 {

	// Deklaracje
	double tablica[] = {10.1, 3.5, 89.7, 60.28, 100.12, 0.01}; // pomiary
	double d;
	
	// Metoda zapis_do_pliku
	public void zapis_do_pliku() throws IOException { 
		
		RandomAccessFile raf = new RandomAccessFile("pomiary.dat", "rw");
		
		for (int i = 0; i < tablica.length; i ++) {
			raf.writeDouble(tablica[i]);
		}
		raf.close();
			
		}
	
	
	// Metoda odczyt_z_pliku
	public void odczyt_z_pliku() throws IOException { 
		
		RandomAccessFile raf = new RandomAccessFile("pomiary.dat", "r");
		
		for (int i = 0; i < tablica.length; i += 2) {
			raf.seek(8*i); // typ double ma 8 bajtów
			d = raf.readDouble();
			System.out.println(d);
		}
		raf.close();
	}
	
}
