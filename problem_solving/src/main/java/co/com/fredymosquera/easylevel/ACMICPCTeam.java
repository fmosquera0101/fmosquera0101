package co.com.fredymosquera.easylevel;

import java.math.BigInteger;
import java.util.*;

public class ACMICPCTeam {

    public static void main(String[] args) {
        List<String> topic = Arrays.asList(
                "10101",
                "11110",
                "00010");
        System.out.println(acmTeam(topic));
    }

    public static List<Integer> acmTeam(List<String> topic) {
        int max = 0;
        int count = 0;
        for(int i = 0; i < topic.size(); i++) {
            for(int j = i+1; j < topic.size(); j++) {
                BigInteger x = new BigInteger(topic.get(i), 2).or(new BigInteger(topic.get(j), 2));
                int c = x.bitCount();
                if (c > max) {
                    max = c;
                    count = 1;
                } else if (c == max) {
                    count++;
                }
            }
        }
        return Arrays.asList(max, count);
    }

    public static List<Integer> acmTeamBruteForce(List<String> topic) {
        // Write your code here

        Map<String, Integer> teamsTopics = new HashMap<>();
        Map<String, String> teamPairs = new HashMap<>();
        Set<Integer> numTeamsMax = new HashSet<>();
        int max = 0;
        for (int i = 0; i < topic.size() ; i++) {
            for (int j = i + 1; j < topic.size(); j++) {
                String teamName = topic.get(i) +" - "+topic.get(j);
                teamPairs.put(teamName, topic.get(i) +""+topic.get(j));
                String[] knownTopicsA = topic.get(i).split("");
                String[] knownTopicsB = topic.get(j).split("");

                for (int k = 0; k <  knownTopicsA.length; k++) {
                    if(knownTopicsA[k].equals("1") || knownTopicsB[k].equals("1")){
                        teamsTopics.put(teamName,teamsTopics.getOrDefault( teamName, 0) + 1);
                        if(max < teamsTopics.get(teamName)){
                            max = teamsTopics.get(teamName);
                        }
                    }
                }



            }
        }

        int finalMax = max;
        int teams = (int) teamsTopics.values().stream().filter(v -> v == finalMax).count();

        return Arrays.asList(max, teams);
    }
}
