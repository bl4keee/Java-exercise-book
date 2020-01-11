package DecyzjeWProgramie;
import java.io.*;

public class Zadanie_24 {

	public static void main(String[] args) throws IOException {
		

		double a, b, c, x;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Program oblicza wartoœæ X z równania liniowego ax + b = c.");
		System.out.println("Proszê podaæ A: ");
		a = Double.parseDouble(br.readLine());
		
		if (a == 0) {
			System.out.println("Nieprawid³owa wartoœæ wspó³czynnika A.");
		} else {
			System.out.println("Proszê podaæ B: ");
			b = Double.parseDouble(br.readLine());
			System.out.println("Proszê podaæ C: ");
			c = Double.parseDouble(br.readLine());
			
			x = (c - b) / a;
			
			System.out.printf("Dla A = " + "%4.2f,", a);
			System.out.printf(" B = " + "%4.2f,", b);
			System.out.printf(" C = " + "%4.2f", c);
			System.out.printf(" wartoœæ X = " + "%4.2f.\n", x);
		}
	}

}
