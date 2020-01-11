package ProsteOperacjeWejœciaWyjœcia;
import java.io.*;

public class Zadanie_11 {

	public static void main(String[] args) 
		throws IOException {
			
			double a;
			double b;
			double pole;
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			try {
			System.out.println("Program oblicza pole prostok¹ta.");
			System.out.println("Podaj bok A: ");
			a = Double.parseDouble(br.readLine());
			System.out.println("Podaj bok B: ");
			b = Double.parseDouble(br.readLine());
			
			pole = a * b;
			
			System.out.println("Pole prostok¹ta o boku A = " + a + " i boku B = " + b + " wynosi " + pole);
		}
			catch (NumberFormatException exc) {
				System.out.println("Nie wczytano liczby. Koniec programu.");
			}

	}

}
