package Hackerrank_Problems.Pangram;


import java.io.*;

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    // Write your code here
    s = s.toLowerCase();
    String alph = "abcdefghijklmnopqrstuvxyz";
    for (char c : alph.toCharArray()){
        if (s.indexOf(c) == -1){
            return "not pangram";
        }
    } 
     return "pangram";
   
        
    }
    

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        // bufferedWriter.write(result);
        // bufferedWriter.newLine();

        bufferedReader.close();
       // bufferedWriter.close();
        System.out.println(result);
    }
}
