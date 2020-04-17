package co.com.fredymosquera.easylevel;

public class JumpingTheCloudsRevisited {

    public static void main(String[] args) {
        int[] c = {1 ,1 ,1, 0, 1, 1, 0, 0, 0, 0};
        int k = 3;
        System.out.println(jumpingOnClouds(c, k));
    }

    static int jumpingOnClouds(int[] c, int k) {

        int energy = 100;
        int i =  k;
        boolean end = false;
        while (!end){
            if(i >= c.length - 1){
                i = 0;
                if(c[i] == 0){
                    energy--;
                    end = true;
                }else {
                    energy -= 3;
                }

            }else {
                if(c[i] == 0){
                    energy--;
                }else {
                    energy -= 3;
                }
                i += k;
            }

        }
        return energy;
    }
}
