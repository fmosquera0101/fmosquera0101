package co.com.fredymosquera;

public class DrawingBook {
    public static void main(String[] args) {
        int n  = 4;
        int p =  4;
        System.out.println(pageCount(n, p));
    }
    static int pageCount(int n, int p) {
        if(p == 1 || p == n || (n % 2 != 0 && (p == n || p == n -1))){
            return 0;
        }
        if(n % 2 == 0 && (p == n -1 || p == n-2)){
            return 1;
        }else {
            int k = 1;
            for (int i = 1; i < n; i++) {
                int pageLeft = i * 2;
                int pageRight = pageLeft + 1;
                if( p == pageLeft || p == pageRight ){
                    k = i;
                    break;
                }

            }
            int j = 1;

                for (int i = n; i > 1; i -= 2) {
                    int pageRight = i - 2;
                    int pageLeft = pageRight - 1;
                    if (p == pageLeft || p == pageRight) {
                        break;
                    }
                    j++;


            }
            return k < j ? k : j;
        }

    }
}
