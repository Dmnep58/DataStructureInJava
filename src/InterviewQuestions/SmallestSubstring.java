package InterviewQuestions;

/*
You are given a string S that is made of lowercase English alphabets. Determine the
length of the smallest substring that contains the maximum number of distinct
characters.
 */

import java.util.HashSet;
import java.util.Set;

public class SmallestSubstring {
    public static int Solve(String S) {
        Set<Character> distinctChars = new HashSet<>();
        int start = 0;
        int end = 0;
        int maxDistinct = 0;
        int minLength = Integer.MAX_VALUE;

        while (end < S.length()) {
            distinctChars.add(S.charAt(end));

            if (distinctChars.size() == maxDistinct) {
                minLength = Math.min(minLength, end - start + 1);
            }

            if (distinctChars.size() > maxDistinct) {
                maxDistinct = distinctChars.size();
                minLength = end - start + 1;
            }

            end++;

            while (distinctChars.size() != maxDistinct) {
                distinctChars.remove(S.charAt(start));
                start++;
            }
        }

        return minLength;
    }

    public static void main(String[] args) {
        String S = "abcda"; // Example string
        int minLength = Solve(S);
        System.out.println("Length of the smallest substring with maximum distinct characters: " + minLength);
    }

}
