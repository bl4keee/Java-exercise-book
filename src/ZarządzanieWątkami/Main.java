package Zarz�dzanieW�tkami;

public class Main {

	public static void main(String[] args) {
		
		MojWatek ob1 = new MojWatek("M�j w�tek");
		
		try { 
			Thread.sleep(1000);
			
			ob1.moj_zawieszony();
			System.out.println("Zawieszenie w�tku.");
			Thread.sleep(1000);
			
			ob1.moj_wznowiony();
			System.out.println("Wznowienie w�tku.");
			Thread.sleep(1000);
			
			ob1.moj_zawieszony();
			System.out.println("Zawieszenie w�tku.");
			Thread.sleep(1000);
			
			ob1.moj_wznowiony();
			System.out.println("Wznowienie w�tku.");
			Thread.sleep(1000);
			
			ob1.moj_zawieszony();
			System.out.println("Zatrzymanie w�tku.");
			ob1.moj_zatrzymany();
			
		} catch (InterruptedException exc) {
			System.out.println("G��wny w�tek zosta� przerwany.");
		}
		try {
			ob1.wtk.join();
			
		} catch (InterruptedException exc) {
			System.out.println("G��wny w�tek zosta� przerwany.");
	}
		System.out.println("G��wny w�tek si� zako�czy�.");

}
}
