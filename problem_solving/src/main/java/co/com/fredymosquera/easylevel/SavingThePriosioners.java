package co.com.fredymosquera.easylevel;

public class SavingThePriosioners {

    public static void main(String[] args) {
        System.out.println(saveThePrisoner(7, 19, 2));
    }

    static int saveThePrisoner(int n, int m, int s) {

        if(m == 1){
            return s;
        }else {
            int i = s;
            while (m-- > 1){
              if(i == n){
                  i = 1;
              }else {
                  i++;
              }
            }
            return i;
        }
    }
}
