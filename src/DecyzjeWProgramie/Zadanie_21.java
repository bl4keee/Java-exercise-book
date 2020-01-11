package DecyzjeWProgramie;
import java.io.*;

public class Zadanie_21 {

	public static void main(String[] args) throws IOException {
		
		int a;
		int b;
		int c;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Proszê podaæ bok A: ");
		a = Integer.parseInt(br.readLine());
		System.out.println("Proszê podaæ bok B: ");
		b = Integer.parseInt(br.readLine());
		System.out.println("Proszê podac bok C: ");
		c = Integer.parseInt(br.readLine());
		
		if((a*a + b*b) == c*c) {
			System.out.println("Boki: ");
			System.out.println("A = " + a);
			System.out.println("B = " + b);
			System.out.println("C = " + c);
			System.out.println("tworz¹ trójk¹t prostok¹tny.");
		} else {
			System.out.println("Boki: ");
			System.out.println("A = " + a);
			System.out.println("B = " + b);
			System.out.println("C = " + c);
			System.out.println("nie tworz¹ trójk¹ta prostok¹tnego.");
		}

	}

}