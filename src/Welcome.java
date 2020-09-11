public class Welcome {

	public static void main(String[] args) {

		// Display message Welcome to Java! on the console
		System.out.println("Welcome to Java!");

		hej("Mikkel");
		goNat("Anders");

	}

	public static void hej(String navn) {

		System.out.println("Hej " + navn  + "!");

	}

	public static void goNat(String navn) {

		System.out.println("God nat " + navn  + "!");

	}

}