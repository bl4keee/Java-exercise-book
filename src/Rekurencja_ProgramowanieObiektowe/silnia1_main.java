package Rekurencja_ProgramowanieObiektowe;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class silnia1_main {

	public static void main(String[] args) throws IOException {
		
		int i;
		int n;
		silnia1 s = new silnia1();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Program oblicza silnie dla dowolnej liczby ca³kowitej.");
		System.out.println("Proszê podaæ N: ");
		n = Integer.parseInt(br.readLine());
		
		for (i = 1; i <= n; i++) {
			System.out.println(i + "! = " + s.silnia(i));
		}
	}

}
