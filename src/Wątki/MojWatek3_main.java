package W¹tki;

public class MojWatek3_main {

	public static void main(String[] args) {
		
		System.out.println("Mój w¹tek startuje.");

		
		// Tworzenie trzech w¹tków
		MojWatek3 mw1 = new MojWatek3("W¹tek 1");
		MojWatek3 mw2 = new MojWatek3("W¹tek 2");
		MojWatek3 mw3 = new MojWatek3("W¹tek 3");
		
		// Pocz¹tek wykonywania nowo utworzonych w¹tków
		do {
			try {
				Thread.sleep(100);
			} catch (InterruptedException exc) {
				System.out.println("G³ówny w¹tek zosta³ przerwany.");
			}
		} while (mw1.licznik < 10 || mw2.licznik < 10 || mw3.licznik < 10);
		System.out.println("G³ówny w¹tek zosta³ zakoñczony.");
	}

}
