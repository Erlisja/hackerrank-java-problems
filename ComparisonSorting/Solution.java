package Hackerrank_Problems.ComparisonSorting;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */      
    public static List<Integer> countingSort(List<Integer> arr) {
        int[] freq = new int [100];
        for (int elem : arr){
            freq[elem]++;
        }

    List <Integer> res = new ArrayList<>();
    for(int val : freq){
        res.add(val);
    }
    return res;
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.countingSort(arr);

        // bufferedWriter.write(
        //     result.stream()
        //         .map(Object::toString)
        //         .collect(joining(" "))
        //     + "\n"
        // );

        bufferedReader.close();
        // bufferedWriter.close();
        System.out.println(result);
    }
}
