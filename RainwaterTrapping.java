public class RainwaterTrapping {

    public static void main(String[] args) {

        int[] height = {0,2,0,3,0,1,3,0,1,2,1,0,2};

        // MY FIRST APPROACH
        int result1 = firstApproach(height);
        System.out.println("First Approach: " + result1);

        // MY SECOND APPROACH
        int result2 = secondApproach(height);
        System.out.println("Second Approach: " + result2);
    }


   
    // MY FIRST APPROACH
   
    static int firstApproach(int[] height) {

        int sum = 0;

        int key = height[0];
        int maxKey = height[0];
        int keyIndex = 0;

        for (int i = 1; i < height.length; i++) {
            if (height[i] > maxKey) {
                maxKey = height[i];
                keyIndex = i;
            }
        }

        for (int i = 1; i < keyIndex; i++) {
            if (key > height[i]) {
                sum += (key - height[i]);
            }
            else {
                key = height[i];
            }
        }

        key = height[height.length - 1];

        for (int j = height.length - 2; j > keyIndex; j--) {
            if (key > height[j]) {
                sum += (key - height[j]);
            }
            else {
                key = height[j];
            }
        }

        return sum;
    }


   
    // MY SECOND APPROACH
   
    static int secondApproach(int[] height) {

        int sum = 0;

        int left = 0;
        int right = height.length - 1;

        int leftmost = left;
        int rightmost = right;

        while (left < right) {

            if (height[left] < height[right]) {

                if (height[leftmost] > height[left + 1]) {
                    sum += height[leftmost] - height[left + 1];
                    left++;
                }
                else {
                    left++;
                    leftmost = left;
                }
            }
            else {

                if (height[rightmost] > height[right - 1]) {
                    sum += height[rightmost] - height[right - 1];
                    right--;
                }
                else {
                    right--;
                    rightmost = right;
                }
            }
        }

        return sum;
    }
}