package W¹tki;

public class MojWatek2_main {

	public static void main(String[] args) {
		
		System.out.println("Mój w¹tek startuje.");
		
		// Obiekt typu MójW¹tek2, obiekt z zaimplementowanym Runnable
		MojWatek2 mw = new MojWatek2("W¹tek 1");
		
		// Tworzymy w¹tek z tego obiektu
		Thread NowyW¹tek = new Thread(mw);
		
		// Pocz¹tek wykonywania siê w¹tku
		NowyW¹tek.start();
		
		
		do {
			try {
				Thread.sleep(100); // zawieszenie na 100 milisekund
			} catch (InterruptedException exc) {
				System.out.println("G³ówny w¹tek zosta³ przerwany.");
			}
		} while (mw.licznik != 10);
		System.out.println("G³ówny w¹tek zosta³ zakoñczony.");
	}

}
