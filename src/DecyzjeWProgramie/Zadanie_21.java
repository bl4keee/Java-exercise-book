package DecyzjeWProgramie;
import java.io.*;

public class Zadanie_21 {

	public static void main(String[] args) throws IOException {
		
		int a;
		int b;
		int c;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Prosz� poda� bok A: ");
		a = Integer.parseInt(br.readLine());
		System.out.println("Prosz� poda� bok B: ");
		b = Integer.parseInt(br.readLine());
		System.out.println("Prosz� podac bok C: ");
		c = Integer.parseInt(br.readLine());
		
		if((a*a + b*b) == c*c) {
			System.out.println("Boki: ");
			System.out.println("A = " + a);
			System.out.println("B = " + b);
			System.out.println("C = " + c);
			System.out.println("tworz� tr�jk�t prostok�tny.");
		} else {
			System.out.println("Boki: ");
			System.out.println("A = " + a);
			System.out.println("B = " + b);
			System.out.println("C = " + c);
			System.out.println("nie tworz� tr�jk�ta prostok�tnego.");
		}

	}

}