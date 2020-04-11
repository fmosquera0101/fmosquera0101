package co.com.fredymosquera.mediumlevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClimbingTheLeaderBoard {

    public static void main(String[] args) {

//        int[] score = {997,981,957,933,930,927,926,920,916,896,887,874,863,863,858,847,815,809,803,794,789,785,783,778,764,755,751,740,737,730,691,677,652,650,587,585,583,568,546,541,540,538,531,527,506,493,457,435,430,427,422,422,414,404,400,394,387,384,374,371,369,369,368,365,363,337,336,328,325,316,314,306,282,277,230,227,212,199,179,173,171,168,136,125,124,95,92,88,85,70,68,61,60,59,44,43,28,23,13,12};
//        System.out.println("Score.size = "+score.length);
//        int[] alice = {12,20,30,32,35,37,63,72,83,85,96,98,98,118,122,125,129,132,140,144,150,164,184,191,194,198,200,220,228,229,229,236,238,246,259,271,276,281,283,287,300,302,306,307,312,318,321,325,341,341,341,344,349,351,354,356,366,369,370,379,380,380,396,405,408,417,423,429,433,435,438,441,442,444,445,445,452,453,465,466,467,468,469,471,475,482,489,491,492,493,498,500,501,504,506,508,523,529,530,539,543,551,552,556,568,569,571,587,591,601,602,606,607,612,614,619,620,623,625,625,627,638,645,653,661,662,669,670,676,684,689,690,709,709,710,716,724,726,730,731,733,737,744,744,747,757,764,765,765,772,773,774,777,787,794,796,797,802,805,811,814,819,819,829,830,841,842,847,857,857,859,860,866,872,879,882,895,900,900,903,905,915,918,918,922,925,927,928,929,931,934,937,955,960,966,974,982,988,996,996};
//        System.out.println("alice.size = "+alice.length);
        int[] score = {100, 100, 50, 40, 40, 20, 10};
        int[] alice = {5, 25, 50 ,120};
        int[] rankinAllice = climbingLeaderboard(score, alice);
        System.out.println("rankinAllice: "+Arrays.toString(rankinAllice));
    }


    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        List<Integer> rankingScore = calculateRankingScore(scores);
        int[] rankingAlice = new int[alice.length];
        for (int i = 0; i < alice.length ; i++) {
            for (int j = scores.length - 1; j > 0; j--) {
                if(alice[i] == scores[j]){
                    rankingAlice[i] = rankingScore.get(j);
                    break;
                }else if(alice[i] < scores[j]){
                    rankingAlice[i] = rankingScore.get(j)+1;
                    break;
                }
            }
            if(rankingAlice[i] == 0){
                if(alice[i] > scores[0]){
                    rankingAlice[i] = 1;
                }else {
                    rankingAlice[i] = 2;
                }

            }
        }
        return  rankingAlice;
    }

    private static List<Integer> calculateRankingScore(int[] scores) {
        List<Integer> ranking = new ArrayList<>();
        int prev = scores[0];
        ranking.add(1);
        for (int i = 1; i < scores.length; i++) {
            if(prev == scores[i]){
                ranking.add(ranking.get(i-1));
            }else{
                ranking.add(ranking.get(i-1) + 1);
            }
            prev = scores[i];
        }

        System.out.println("ranking: "+ranking);
        return ranking;
    }
}
