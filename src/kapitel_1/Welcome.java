package kapitel_1;

public class Welcome {

	public static void main(String[] args) {

		// Display message kapitel_1.Welcome to Java! on the console
		System.out.print("kapitel_1.Welcome to Java!");
		System.out.print("kapitel_1.Welcome to Java!");

		hej("Mikkel");
		hej("Deniz");
		goNat("Anders");

	}

	// Her er et eksempel på en metode
	public static void hej(String navn) {
		System.out.println("Hej " + navn  + "!");
	}

	// Her er et eksempel på en anden metode
	public static void goNat(String navn) {
		System.out.println("God nat " + navn  + "!");
		hej("DU");
	}

}