package W�tki;

public class TikTak {

	// metoda Tik
	synchronized void tik (boolean chodzi) { // tylko z synchronized metodami dzia�a notify i wait
		if (!chodzi) {
			notify(); // powiadamia czekaj�cy w�tek
			return;
		}
		System.out.print("Tik ");
		notify(); // niech uruchomi si� w�tek tak()
		try {
			wait(); // czekamy a� w�tek tak() si� zako�czy
		} catch (InterruptedException exc) {
			System.out.println("W�tek zosta� przerwany.");
		}
	}
	
	// metoda Tak
	synchronized void tak (boolean chodzi) {
		if (!chodzi) { // zatrzymanie zegara
			notify(); // powiadomienie czekaj�cego w�tku
			return;
		}
		System.out.println("Tak");
		notify(); // niech uruchomi si� metoda tik()
		try {
			wait(); // czekamy, a� w�tek tik() si� zako�czy
		} catch (InterruptedException exc) {
			System.out.println("W�tek zosta� przerwany.");
		}
	}
}
