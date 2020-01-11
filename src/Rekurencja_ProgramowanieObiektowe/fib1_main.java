package Rekurencja_ProgramowanieObiektowe;

public class fib1_main {

	public static void main(String[] args) {
		
		int i;
		int n = 10;
		fib1 ciag = new fib1();
		
		System.out.println("Program znajduje rekurencyjnie + n + pierwszych liczb ci¹gu Fibonacciego.\n");
		
		for (i = 0; i < n; i++) {
			System.out.println(ciag.fib(i));
		}
		
	}

}
