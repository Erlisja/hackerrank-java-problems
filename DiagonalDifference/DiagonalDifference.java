package Hackerrank_Problems.DiagonalDifference;

import java.io.*;
import java.util.*;

class Result {
    
    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
     int rDiag = 0;
    int lDiag = 0;
    for (int i = 0; i<arr.size(); i++){
        rDiag += arr.get(i).get(i);  // to access the elements of the list of lists (2D array) in Java we use get() method twice. 
        lDiag += arr.get(i).get(arr.size()-i-1);  // 
    }
    return Math.abs(lDiag-rDiag);

    }
}

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result.diagonalDifference(arr);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
        System.out.println(result);
    }
}
