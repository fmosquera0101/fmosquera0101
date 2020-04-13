package co.com.fredymosquera.easylevel;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DesignerPDFViewerWithStreams {
    public static void main(String[] args) {
        String alphabet = "nrdyluacvr";
        System.out.println((int)'a');
        int[] hg = {6,3, 4, 4, 6, 4, 5, 3, 4, 3, 6, 5, 4, 6, 7, 1, 3, 4, 2, 5, 6, 1, 5, 1, 7, 2};
        char[] let = alphabet.toCharArray();

        for (int i = 0; i < let.length; i++) {
            int alf = Math.abs ((int) let[i] - 97);
            System.out.println("alf: "+alf);
        }

        System.out.println(designerPdfViewer(hg, alphabet));
    }

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
       int max = word.chars().map(c -> c - 97)
               .map(c -> h[c]).max().getAsInt();

        int sizeWord = word.length();
        return sizeWord*max;
    }
}
