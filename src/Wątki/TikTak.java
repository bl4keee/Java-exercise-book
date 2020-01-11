package W¹tki;

public class TikTak {

	// metoda Tik
	synchronized void tik (boolean chodzi) { // tylko z synchronized metodami dzia³a notify i wait
		if (!chodzi) {
			notify(); // powiadamia czekaj¹cy w¹tek
			return;
		}
		System.out.print("Tik ");
		notify(); // niech uruchomi siê w¹tek tak()
		try {
			wait(); // czekamy a¿ w¹tek tak() siê zakoñczy
		} catch (InterruptedException exc) {
			System.out.println("W¹tek zosta³ przerwany.");
		}
	}
	
	// metoda Tak
	synchronized void tak (boolean chodzi) {
		if (!chodzi) { // zatrzymanie zegara
			notify(); // powiadomienie czekaj¹cego w¹tku
			return;
		}
		System.out.println("Tak");
		notify(); // niech uruchomi siê metoda tik()
		try {
			wait(); // czekamy, a¿ w¹tek tik() siê zakoñczy
		} catch (InterruptedException exc) {
			System.out.println("W¹tek zosta³ przerwany.");
		}
	}
}
