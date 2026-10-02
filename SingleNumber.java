import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

  /**
   * Approach 1: Frequency Map (HashMap)
   * ----------------------------------
   * Strategy: Count occurrences of each number using a HashMap,
   * then search for the key with a frequency count of 1.
   * 
   * Time Complexity : O(N) - Traversing array + searching entries
   * Space Complexity : O(N) - Storing unique numbers in map
   * Measured Runtime : ~14ms (LeetCode)
   */
  public static int findSingleNumberHashMap(int[] arr) {

    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      int key = arr[i];

      if (map.containsKey(key)) {
        int p = map.get(key) + 1;
        map.put(key, p);
      }

      else {
        int count = 1;
        map.put(key, count);
      }
    }

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() == 1) {
        return entry.getKey();
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 1, 3, 3 };

    int result = findSingleNumberHashMap(arr);

    System.out.println("Single number is: " + result);
  }
}