package co.com.fredymosquera.easylevel;

public class AngryProfessor {

    public static void main(String[] args) {

    }

    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {
        int count = 0;
        for (int at: a) {
            if(at <= 0){
                count++;
            }
        }
        return  count >= k?"NO":"YES";
    }

}
