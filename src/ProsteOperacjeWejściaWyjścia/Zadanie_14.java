package ProsteOperacjeWej�ciaWyj�cia;
import java.io.*;

public class Zadanie_14 {

	public static void main(String[] args) 
			throws IOException {
			
			double promien;
			double objetosc;
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			try {
			System.out.println("Program oblicza obj�to�� kuli.");
			System.out.println("Prosz� poda� warto�� promienia: ");
			promien = Double.parseDouble(br.readLine());
			
			objetosc = (4 * Math.PI * promien * promien * promien) / 3;
			
			System.out.printf("Obj�to�� kuli o promieniu r = ");
			System.out.printf("%2.2f", promien);
			System.out.printf(" wynosi " + "%2.2f.", objetosc);

	}
			catch (NumberFormatException exc) {
				System.out.println("Nie wczytano liczby. Koniec programu.");
			}
}
}

