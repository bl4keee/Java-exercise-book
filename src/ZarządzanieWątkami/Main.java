package Zarz¹dzanieW¹tkami;

public class Main {

	public static void main(String[] args) {
		
		MojWatek ob1 = new MojWatek("Mój w¹tek");
		
		try { 
			Thread.sleep(1000);
			
			ob1.moj_zawieszony();
			System.out.println("Zawieszenie w¹tku.");
			Thread.sleep(1000);
			
			ob1.moj_wznowiony();
			System.out.println("Wznowienie w¹tku.");
			Thread.sleep(1000);
			
			ob1.moj_zawieszony();
			System.out.println("Zawieszenie w¹tku.");
			Thread.sleep(1000);
			
			ob1.moj_wznowiony();
			System.out.println("Wznowienie w¹tku.");
			Thread.sleep(1000);
			
			ob1.moj_zawieszony();
			System.out.println("Zatrzymanie w¹tku.");
			ob1.moj_zatrzymany();
			
		} catch (InterruptedException exc) {
			System.out.println("G³ówny w¹tek zosta³ przerwany.");
		}
		try {
			ob1.wtk.join();
			
		} catch (InterruptedException exc) {
			System.out.println("G³ówny w¹tek zosta³ przerwany.");
	}
		System.out.println("G³ówny w¹tek siê zakoñczy³.");

}
}
