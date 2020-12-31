package HackerRank.Interview1.WarmUp.SherlockandAnagrams;
/**
 * Two strings are anagrams of each other if the letters of one string can be rearranged to form the other string. Given a string, find the number of pairs of substrings of the string that are anagrams of each other.
 *
 * Example
 *
 * The list of all anagrammatic pairs is  at positions  respectively.
 *
 * Function Description
 *
 * Complete the function sherlockAndAnagrams in the editor below.
 *
 * sherlockAndAnagrams has the following parameter(s):
 *
 * string s: a string
 * Returns
 *
 * int: the number of unordered anagrammatic pairs of substrings in
 * Input Format
 *
 * The first line contains an integer , the number of queries.
 * Each of the next  lines contains a string  to analyze.
 *
 * Constraints
 *
 *
 *
 *  contains only lowercase letters in the range ascii[a-z].
 *
 * Sample Input 0
 *
 * 2
 * abba
 * abcd
 * Sample Output 0
 *
 * 4
 * 0
 * Explanation 0
 *
 * The list of all anagrammatic pairs is  and  at positions  and  respectively.
 *
 * No anagrammatic pairs exist in the second query as no character repeats.
 *
 * */

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.sherlockAndAnagrams("cdcd"));
        System.out.println(Solution.sherlockAndAnagrams("ifailuhkqq"));
        System.out.println(Solution.sherlockAndAnagrams("kkkk"));
        System.out.println(Solution.sherlockAndAnagrams("abcd"));
        System.out.println(Solution.sherlockAndAnagrams("abba"));

    }
}
