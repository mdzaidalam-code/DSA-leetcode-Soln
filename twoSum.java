import java.util.HashMap;
import java.util.Map;

public class twoSum {
  public static void main(String[] args) {
    int[] nums = {3,3,4,3,6,5};
    int target = 9;

    Map<Integer,Integer>map = new HashMap<>();
    // int toSearch = 0;
    // 
    // for (int i = 0; i < nums.length-1; i++) {
    //   toSearch = target-nums[i];
    //   int j = i+1;
    //   while (j<nums.length) {
    //     if (toSearch==nums[j]) {
    //       System.out.println(nums[i] + "+" + nums[j] + "=" + target);
    //       break;
    //     }
    //     else{
    //       j++;
    //     }
    //   }
    // }

    for (int i = 0; i < nums.length; i++) {
      int req = target-nums[i];

      if (map.containsKey(req)) {
        int p = map.get(req);
        System.out.println(req + " " + p);
        System.out.println(nums[i]+ " " +i);
        break;
      }

      else{
        map.put(nums[i], i);
      }
    }
  }
}
