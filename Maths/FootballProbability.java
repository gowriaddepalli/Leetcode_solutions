import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    // Complete the findMaxGoalsProbability function below.
    static String findMaxGoalsProbability(List<Integer> teamGoals) {
        int n = teamGoals.size();
        int numberOfGames = (n *(n-1))/2;
        double prob = 0.0;
        double count =0.0;

        Collections.sort(teamGoals, Collections.reverseOrder());
        if(n == 0){
            return "0.00";
        }

        int max = teamGoals.get(0) + teamGoals.get(1);
        
        for(int i = 0; i<= teamGoals.size()-1; i++){
           for(int j = i+1; j<= teamGoals.size()-1; j++){
                  if((teamGoals.get(i)+teamGoals.get(j)) == max){
                      count++;
                  }
           }
        }

        prob = count/numberOfGames;

        return String.format ("%.2f", prob);
    }

    public static void main(String[] args) throws IOException {
