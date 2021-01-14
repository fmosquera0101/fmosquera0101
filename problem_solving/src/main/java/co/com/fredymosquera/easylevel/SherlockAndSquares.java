package co.com.fredymosquera.easylevel;

public class SherlockAndSquares {
    
    public static void main(String[] args) {
        
        System.out.println(squares(24, 49));
    }
    
    // Complete the squares function below.
   /* static int squares(int a, int b) {
    
        int count = 0;
        for (int i = a; i <= b ; i++) {
            double sqrt = Math.sqrt(i);
            double fraction = sqrt - Math.floor(sqrt);
            if(fraction == 0.0){
                count++;
            }
        }
        return count;
    }*/
    static int squares(int a, int b) {
        
        int squares = 0;
        int n = 1;
        while (n * n < a){
            n++;
        };
        while (n * n <= b){
            squares++;
            n++;
        }
        return squares;
    }
    
}
