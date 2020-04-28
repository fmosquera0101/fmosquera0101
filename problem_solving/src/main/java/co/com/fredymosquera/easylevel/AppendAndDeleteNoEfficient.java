package co.com.fredymosquera.easylevel;

public class AppendAndDeleteNoEfficient {

    public static void main(String[] args) {
        String s = "hackerhappy";
        String t = "hackerrank";
        int k = 9;
        System.out.println(appendAndDelete(s, t, k));
    }

    static String appendAndDelete(String s, String t, int k) {

        if (t.length() == s.length()){


            String[] charS = s.split("");
            String[] charT = t.split("");
            int idx = 0;
            for (int i = 0; i < charT.length ; i++) {
                if(!charS[i].equals(charT[i])){
                    idx = i;
                    break;
                }
            }

            if(idx == 0){
                return "Yes";
            }
            String subS = s.substring(idx, s.length());
            String subT = t.substring(idx, t.length());
            if((subS.length() + subT.length()) == k){
                return "Yes";
            }



        }else if(s.length() > t.length()){

            String[] charS = s.split("");
            String[] charT = t.split("");
            int idx = 0;
            for (int i = 0; i < charT.length ; i++) {
                if(!charS[i].equals(charT[i])){
                    idx = i;
                    break;
                }
            }

            if(idx == 0){
                return "Yes";
            }
            String subS = s.substring(idx, s.length());
            String subT = t.substring(idx, t.length());
            if((subS.length() + subT.length()) == k){
                return "Yes";
            }


        }else {
            String[] charS = s.split("");
            String[] charT = t.split("");
            int idx = 0;
            for (int i = 0; i < charS.length ; i++) {
                if(!charS[i].equals(charT[i])){
                    idx = i;
                    break;
                }
            }

            if(idx == 0){
                return "Yes";
            }
            String subS = s.substring(idx, s.length());
            String subT = t.substring(idx, t.length());
            if((subS.length() + subT.length()) == k){
                return "Yes";
            }
        }
        return "No";
    }

}
