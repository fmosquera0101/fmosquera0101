package co.com.fredymosquera.easylevel;

public class ViralAdvertising {

    public static void main(String[] args) {
        int n = 3;
        System.out.println(viralAdvertising(n));
    }

    static int viralAdvertising(int n) {

        int share = 3;
        int ret = 5 / 2;
        int result = 0;

        for( int i = 1; i <= n; i ++){
            result += ret;
            ret = share * ret / 2;

        }

        return  result;

    }
}
