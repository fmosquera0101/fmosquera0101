package co.com.fredymosquera.easylevel;

public class TaumBday {

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        // Write your code here

        long blackCost = bc;
        long whiteCost = wc;
        long convertBlack = z+wc;
        long convertWhite = z+bc;
        if(convertBlack<bc) blackCost = convertBlack;
        if(convertWhite<wc) whiteCost = convertWhite;
        long total = (b*blackCost) + (w*whiteCost);
        return total;

    }
}
