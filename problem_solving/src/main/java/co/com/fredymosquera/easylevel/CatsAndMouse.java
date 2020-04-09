package co.com.fredymosquera.easylevel;

public class CatsAndMouse {
    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        int z = 2;
        System.out.println(catAndMouse(x, y, z));

        System.out.println(Math.abs(5-8));
    }
    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        if(Math.abs(x - z) < Math.abs(y-z)){
            return "Cat A";
        }
        else if (Math.abs(x - z) > Math.abs(y-z)){
            return "Cat B";
        }
        else{
            return "Mouse C";
        }
    }
}
