package co.com.fredymosquera.easylevel;

public class SavingThePriosionersOptimise {

    public static void main(String[] args) {
        System.out.println(saveThePrisoner(7, 19, 2));
    }

    static int saveThePrisoner(int n, int m, int s) {

        if(m == 1){
            return s;
        }else {
            int r =  m % n;
            if((r + s - 1) % n == 0){
                return  n;
            }else{
                return (r + s - 1) % n;
            }
        }
    }
}
