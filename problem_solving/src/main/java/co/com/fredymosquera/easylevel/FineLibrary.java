package co.com.fredymosquera.easylevel;

public class FineLibrary {
    
    public static void main(String[] args) {
    
    }
    
    // Complete the libraryFine function below.
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fine = 0;
        if(y1 <= y2 && m1 <= m2 && d1 <= d2){
            fine = 0;
            return fine;
        }
        
        if(y1 == y2 && m1 == m2 && d1 > d2){
            fine = 15 * (d1 - d2);
            return fine;
        }
    
        if(y1 == y2 && m1 > m2 ){
            fine = 500 * (m1 - m2);
            return fine;
        }
        
        if(y1 > y2 ){
            return 10000;
        }
        
        return fine;
    }
}
