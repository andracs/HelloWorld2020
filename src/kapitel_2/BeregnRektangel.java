/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 14/09/2020
 */
package kapitel_2;

public class BeregnRektangel {

    // Lav en metode, der beregner arealet af en rektangel (med heltal)
    public static int beregnRektangel(int a, int b) {
        return a*b;
    }

    // Kald metoden fra din main() med værdierne

    public static void main(String[] args) {
        // Vis resultaterne
        // a=2 b=5
        System.out.println("Areaalet for a=2 b=5 :" + beregnRektangel(2,5));
        // a=6 b=12
        System.out.println("Areaalet for a=6 b=12: " + beregnRektangel(6,12));
    }

}
