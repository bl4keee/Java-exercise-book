package W¹tki;

public class MojWatek5_main {

	public static void main(String[] args) {
		
		MojWatek5 mw1 = new MojWatek5("Wysoki priorytet");
		MojWatek5 mw2 = new MojWatek5("Niski priorytet");
		
		// Nadawanie priorytetów
		mw1.wtk.start();
		mw2.wtk.start();
		
		try {
			mw1.wtk.join();
			mw2.wtk.join();
		} catch (InterruptedException exc) {
			System.out.println("G³ówny w¹tek zosta³ przerwany.");
		}
		System.out.println("Wysoki priorytet w¹tku: stan licznika = " + mw1.licznik + ".");
		System.out.println("Niski priorytet w¹tku: stan licznika = " + mw2.licznik + ".");
	}

}
