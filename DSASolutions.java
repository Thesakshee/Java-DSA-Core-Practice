import java.util.*;

public class DSASolutions {
    public static void main(String[] args) {
        // Example 1: Two Sum (Hashing)
        int[] nums = {2, 7, 11, 15};
        System.out.println("Two Sum Result: " + Arrays.toString(twoSum(nums, 9)));

        // Example 2: Valid Anagram (Strings/Hashing)
        System.out.println("Is Anagram: " + isAnagram("anagram", "nagaram"));
    }

    /**
     * Problem: Two Sum
     * Time Complexity: O(n) using HashMap
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    /**
     * Problem: Valid Anagram
     * Time Complexity: O(n)
     */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count) if (c != 0) return false;
        return true;
    }
}
