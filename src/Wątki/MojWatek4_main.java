package W¹tki;

public class MojWatek4_main {

	public static void main(String[] args) {
		
		System.out.println("Mój w¹tek startuje.");

		
		// Tworzenie trzech w¹tków
		MojWatek4 mw1 = new MojWatek4("W¹tek 1");
		MojWatek4 mw2 = new MojWatek4("W¹tek 2");
		MojWatek4 mw3 = new MojWatek4("W¹tek 3");
		
		// Oczekiwanie, dopóki nie zakoñcz¹ siê okreœlone w¹tki
		try {
			mw1.wtk.join();
			System.out.println("W¹tek 1 do³¹czy³.");
			mw2.wtk.join();
			System.out.println("W¹tek 2 do³¹czy³.");
			mw3.wtk.join();
			System.out.println("W¹tek 3 do³¹czy³.");
		} catch (InterruptedException exc) {
			System.out.println("G³ówny w¹tek zosta³ przerwany.");
		}
		System.out.println("G³ówny w¹tek zosta³ zakoñczony.");
		
		
		
	}
	}

