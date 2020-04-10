package co.com.fredymosquera.mediumlevel;

public class FormingMagicSquare {

    public static void main(String[] args) {

        int[][] s = {
                {4, 5, 8},
                {2, 4, 1},
                {1, 9, 7}
        };
        formingMagicSquare(s);
    }

    static int formingMagicSquare(int[][] s) {
        int [][][] allPosibleTrans = {
                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
        };
        int minCost = 81;
        for (int i = 0; i < 8 ; i++) {
            int tempCost = 0;
            for (int j = 0; j < s.length ; j++) {
                for (int k = 0; k < s.length ; k++) {
                    tempCost += Math.abs(s[j][k] - allPosibleTrans[i][j][k]);
                }

            }
            if (tempCost < minCost){
                minCost = tempCost;
            }
        }
        return minCost;
    }

}

