package leetcode;

import java.util.Arrays;

/* Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * Note: You may assume the string contains only lowercase alphabets.
 */
public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) return false;
        	int[] record = new int[256];
        	for(char x : s.toCharArray())
        		record[x]++;
        	for(char x : t.toCharArray())
        		record[x]--;
        	for(int x : record)
        		if(x != 0) return false;
        	return true;
	}
}
