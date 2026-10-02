import java.util.HashMap;
import java.util.Map;

public class validAnagram {
    public static void main(String[] args) {
        String s = "elpap";
        String t = "apple";

        boolean result = isAnagram(s, t);

        if (result) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

    /**
     * Approach 1: HashMap Frequency Counting
     * LeetCode Runtime: ~18ms
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * 
     * Reason for 18ms runtime: 
     * Using Map<Character, Integer> introduces performance overhead due to 
     * HashMap hashing calculations and object autoboxing (char -> Character, int -> Integer).
     */
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        // Base Check: If lengths differ, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        } 
        else {
            // Pass 1: Build character frequency map for string 's'
            for (int i = 0; i < s.length(); i++) {
                char key = s.charAt(i);
                if (map.containsKey(key)) {
                    int p = map.get(key) + 1;
                    map.put(key, p);
                } else {
                    int count = 1;
                    map.put(key, count);
                }
            }

            // Pass 2: Decrement frequency map using characters from string 't'
            for (int i = 0; i < s.length(); i++) {
                char key = t.charAt(i);
                if (map.containsKey(key)) {
                    int p = map.get(key) - 1;
                    if (p != 0) {
                        map.put(key, p);
                    } else {
                        map.remove(key); // Remove entry once count reaches zero
                    }
                } else {
                    // Character in 't' does not exist in 's'
                    return false;
                }
            }

            // If map is empty, all character counts matched perfectly
            if (map.isEmpty()) {
                return true;
            }
        }

        return false;
    }
}