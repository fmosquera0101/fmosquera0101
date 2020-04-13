package co.com.fredymosquera.easylevel;

public class DesignerPDFViewer {
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

        char[] letters = word.toCharArray();
        int[] intLet = new int[letters.length];
        for (int i = 0; i < letters.length ; i++) {
            intLet[i] =  ((int) letters[i] - 97);
        }
        int idx = intLet[0];
        int max = h[idx];
        for (int i = 1; i < intLet.length; i++) {
            if(h[intLet[i]] > max){
                max = h[intLet[i]];
            }
        }
        int sizeWord = word.length();
        return sizeWord*max;
    }
}
