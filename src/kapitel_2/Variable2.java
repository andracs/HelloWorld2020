/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 16/09/2020
 */
package kapitel_2;

public class Variable2 {

    static int  omdrejning;

    public static void start(int omd){
        omdrejning = omd;
    }

    public static void stop(){
        omdrejning = 0;
    }

    public void accelerer(){
        omdrejning = omdrejning + 100;
    }


    public static void main(String[] args) {

        int x;
        double y = 9;
        x = 9;
        x = 8;
        x = 2;

        start(1000);

        start(2000);

        stop();
        System.out.println(x+y);
    }
}
