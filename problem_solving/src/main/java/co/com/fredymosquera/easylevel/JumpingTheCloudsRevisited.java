package co.com.fredymosquera.easylevel;

public class JumpingTheCloudsRevisited {

    public static void main(String[] args) {
        int[] c = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
        int k = 3;

        System.out.println(jumpingOnClouds(c, k));
    }

    static int jumpingOnClouds(int[] c, int k) {

        int energy = 100;
        int n = c.length;
        int i = k % n;
        energy -= c[i] * 2 + 1;
        while (i != 0) {
            i = (i + k) % n;
            energy -= c[i] * 2 + 1;

        }
        return energy;
    }
}
