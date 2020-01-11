package ProsteOperacjeWej�ciaWyj�cia;
import java.io.*;

public class Zadanie_17 {

	public static void main(String[] args) 
		throws IOException { 
		
		float x; 
		float y;
		float suma;
		float roznica;
		float iloczyn;
		float iloraz;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
		System.out.println("Program oblicza sum�, r�nic�, iloczyn i iloraz");
		System.out.println("dla dw�ch liczb wprowadzanych przez u�ytkownika.");
		System.out.println("Prosz� poda� liczb� X: ");
		x = Float.parseFloat(br.readLine());
		System.out.println("Prosz� poda� liczb� Y: ");
		y = Float.parseFloat(br.readLine());
		
		suma = x + y;
		roznica = x - y;
		iloczyn = x * y;
		iloraz = x / y;
		
		System.out.printf("Dla liczb X = " + "%2.2f", x);
		System.out.printf(" i Y = " + "%2.2f", y);
		System.out.println(""); // empty line
		System.out.printf("Suma = " + "%2.2f\n", suma);
		System.out.printf("R�nica = " + "%2.2f\n", roznica);
		System.out.printf("Iloczyn = " + "%2.2f\n", iloczyn);
		System.out.printf("Iloraz = " + "%2.2f", iloraz);
	}
		catch (NumberFormatException exc) {
			System.out.println("Nie wczytano liczby. Koniec programu.");
		}

}
}
