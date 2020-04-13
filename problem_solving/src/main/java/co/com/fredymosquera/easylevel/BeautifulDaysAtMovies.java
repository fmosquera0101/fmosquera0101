package co.com.fredymosquera.easylevel;

public class BeautifulDaysAtMovies {
    public static void main(String[] args) {
        StringBuilder nm = new StringBuilder(""+20);
        System.out.println(nm.toString()+"--"+nm+"--"+Integer.parseInt(nm.reverse().toString()));
        System.out.println(beautifulDays(20, 23, 6));
    }

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {

        int count = 0;
        for (int l = i; l <= j ; l++) {
            int sum = Math.abs(l - Integer.parseInt(new StringBuilder(""+l).reverse().toString()));
            if(sum % k == 0){
                count++;
            }
        }

        return count;
    }
}
