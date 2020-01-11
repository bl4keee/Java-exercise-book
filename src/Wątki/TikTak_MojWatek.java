package W¹tki;

public class TikTak_MojWatek implements Runnable {

	Thread wtk;
	TikTak tt0b;
	
	// Nowy w¹tek
	TikTak_MojWatek (String nazwa, TikTak tt) {
		wtk = new Thread (this, nazwa);
		tt0b = tt;
		wtk.start();
	}
	
	// Pocz¹tek nowego w¹tku
	public void run() {
		if (wtk.getName().compareTo("Tik") == 0) { // jeœli nazwa w¹tku to Tik to uruchom tik()
			for (int i = 0; i < 5; i ++) {
				tt0b.tik(true);
				tt0b.tik(false);
			}
		} else {
			for (int i = 0; i < 5; i++) { // jeœli nazwa w¹tku to Tak to uruchom tak()
				tt0b.tak(true);
				tt0b.tak(false);
			}
		}
	}
}
