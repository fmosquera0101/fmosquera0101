package co.com.fredymosquera.easylevel;

public class UtopianTree {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(utopianTree(n));
    }

    static int utopianTree(int n) {
        int grow = 1;
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0 ){
                grow += 1;
            }else {
                grow *= 2;
            }
        }
        return grow;
    }
}
