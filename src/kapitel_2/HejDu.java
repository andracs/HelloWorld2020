/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 14/09/2020
 */
package kapitel_2;

import java.util.Scanner;

public class HejDu {

    public static void main(String[] args) {


        // De her tre linjer tilsammen indlæser en String
        System.out.print("Skriv dit navn: ");
        Scanner input = new Scanner(System.in);
        String navn = input.next();

        System.out.println("Hej " + navn + "!" );

        // Eksempel på indlæsning af tal
        System.out.print("Skriv radius: ");
        int radius = input.nextInt();

    }

}
