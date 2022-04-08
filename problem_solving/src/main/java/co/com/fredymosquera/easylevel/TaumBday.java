package co.com.fredymosquera.easylevel;

public class TaumBday {

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        // Write your code here

        return b * Math.min(bc, wc + z) + w *Math.min(wc, bc + z);

    }
}
