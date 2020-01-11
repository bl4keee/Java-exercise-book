package W�tki;

public class MojWatek3_main {

	public static void main(String[] args) {
		
		System.out.println("M�j w�tek startuje.");

		
		// Tworzenie trzech w�tk�w
		MojWatek3 mw1 = new MojWatek3("W�tek 1");
		MojWatek3 mw2 = new MojWatek3("W�tek 2");
		MojWatek3 mw3 = new MojWatek3("W�tek 3");
		
		// Pocz�tek wykonywania nowo utworzonych w�tk�w
		do {
			try {
				Thread.sleep(100);
			} catch (InterruptedException exc) {
				System.out.println("G��wny w�tek zosta� przerwany.");
			}
		} while (mw1.licznik < 10 || mw2.licznik < 10 || mw3.licznik < 10);
		System.out.println("G��wny w�tek zosta� zako�czony.");
	}

}
