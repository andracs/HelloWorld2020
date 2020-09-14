/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 14/09/2020
 */
package kapitel_2;

public class ComputeWithMethod {

    public static void main(String[] args) {

        // Konkatenering
        String beregningsType = "areal";
        System.out.println("Beregnen " + beregningsType  + " med metoder");


        System.out.println("Arealet for radius 2 er " + beregnAreal(3.2));
        System.out.println("Arealet for radius 5 er " + beregnAreal(5.7));
        System.out.println("Arealet for radius 7 er " + beregnAreal(7.8));

        double toCirkler = beregnAreal(3) + beregnAreal(5);

        System.out.println("Summen af arealet af 2 cirkler : " +  toCirkler);

    }

    public static double beregnAreal(double radius) {
        double areal = radius * radius * Math.PI;
        return areal;
    }

}
