package co.com.fredymosquera.easylevel;

public class AppendAndDelete {

    public static void main(String[] args) {
        String s = "qwerasdf";
        String t = "qwerbsdf";
        int k = 6;
        System.out.println(appendAndDelete(s, t, k));
    }

    static String appendAndDelete(String s, String t, int k) {

        if(s.length() + t.length() < k){
            return "Yes";
        }
        int min = Math.min(s.length(), t.length());
        int lengthPrefix = 0;
        for (int i = 0; i < min; i++) {
            if(s.charAt(i) == t.charAt(i)){
                lengthPrefix++;
            }else {
                break;
            }
        }
        int value = s.length() - lengthPrefix + t.length() - lengthPrefix;
        if ( value <= k &&  (k - value) % 2 == 0){
            return "Yes";
        }else{
            return "No";
        }
    }

}
