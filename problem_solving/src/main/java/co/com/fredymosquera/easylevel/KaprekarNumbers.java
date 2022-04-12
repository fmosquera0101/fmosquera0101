package co.com.fredymosquera.easylevel;

public class KaprekarNumbers {

    public static void main(String[] args) {
        kaprekarNumbers(1, 99999);
    }

    public static void kaprekarNumbers(int p, int q) {
        // Write your code here
        boolean isValidRange = false;
        for (int i = p; i <= q; i++) {
            String number = String.valueOf(i * i);
            int sum = 0;
            if(number.length() > 2){
                int a = Integer.parseInt(number.substring(0, number.length() / 2));
                int b = Integer.parseInt(number.substring(number.length() / 2));
                sum = a + b;
            }
            else{
                String[] arraNums = number.split("");
                for (String num : arraNums) {
                    sum += Integer.parseInt(num);

                }
            }

            if(sum !=0 && sum  == i){
                System.out.print(i+" ");
                isValidRange = true;
            }
            sum = 0;

        }
        if(!isValidRange){
            System.out.print("INVALID RANGE");
        }

    }

}
