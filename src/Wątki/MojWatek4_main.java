package W�tki;

public class MojWatek4_main {

	public static void main(String[] args) {
		
		System.out.println("M�j w�tek startuje.");

		
		// Tworzenie trzech w�tk�w
		MojWatek4 mw1 = new MojWatek4("W�tek 1");
		MojWatek4 mw2 = new MojWatek4("W�tek 2");
		MojWatek4 mw3 = new MojWatek4("W�tek 3");
		
		// Oczekiwanie, dop�ki nie zako�cz� si� okre�lone w�tki
		try {
			mw1.wtk.join();
			System.out.println("W�tek 1 do��czy�.");
			mw2.wtk.join();
			System.out.println("W�tek 2 do��czy�.");
			mw3.wtk.join();
			System.out.println("W�tek 3 do��czy�.");
		} catch (InterruptedException exc) {
			System.out.println("G��wny w�tek zosta� przerwany.");
		}
		System.out.println("G��wny w�tek zosta� zako�czony.");
		
		
		
	}
	}

