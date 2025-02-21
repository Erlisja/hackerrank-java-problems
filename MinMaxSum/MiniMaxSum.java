package Hackerrank_Problems.MinMaxSum;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {
    
        public static void miniMaxSum(List<Integer> arr) {
            // Write your code here
            long totalSum = 0;
            long minValue = Long.MAX_VALUE;
            long maxValue = Long.MIN_VALUE;
            for (int i = 0; i <= arr.size(); i++){
                totalSum += arr.get(i);
                minValue = Math.min(minValue, arr.get(i));
                maxValue = Math.max(maxValue, arr.get(i));
            }

        }
}

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
    
}
