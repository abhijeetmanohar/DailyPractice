// Cool implementation of hash map with Strings
// Question : https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        //Creating a hashmap for each character
        HashMap<Character, Integer> map = new HashMap();
        int count = 0;
        for(char ch : a.toCharArray()){
            if(map.containsKey(ch)){
                count = map.get(ch);
                map.put(ch, count+1);
            }else{
                map.put(ch, 1);
            }
        }
        count = 0;
        for(char ch: b.toCharArray()){
            if(map.containsKey(ch)){
                count = map.get(ch);
                map.put(ch, count - 1);
            }else{
                count = 0;
                map.put(ch, count - 1);
            }
        }
        Collection<Integer> vals = map.values();
        ArrayList<Integer> values = new ArrayList<Integer>(vals); 
        int sum= 0;
        for(int val : values){
            sum += Math.abs(val);
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
