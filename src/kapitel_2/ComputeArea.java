package kapitel_2;

public class ComputeArea {

  public static void main(String[] args) {

    double a; // variabel
    double r; // variabel
    final double pi = 3.14159; // konstant
    String programTitel = "Areal-beregner";
    boolean erDuGlad = true;
    int heltal = 9;

    // Assign a radius
    r = 6;

    // Compute area
    a = r * r * pi;

    // Display results
    System.out.println(a);
  }

}
