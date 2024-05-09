public class Question3 {

    /*
     * Question 3. Remove Element in Array.
     * You are given two integer arrays nums1 and nums2,
     * sorted in non-decreasing order, and two integers m and n,
     * representing the number of elements in nums1 and nums2 respectively
     */
    /*
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [3,2,2,3], val = 3
     * Output: 2, nums = [2,2,_,_]
     * Explanation: Your function should return k = 2, with the first two elements
     * of nums being 2.
     * It does not matter what you leave beyond the returned k (hence they are
     * underscores).
     */

    public static int removeElement(int nums[], int val) {

        int k = 0;
        // looping on array
        for (int i = 0; i < nums.length; i++) {
            // Check value val = array[i] value

            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 2, 3 };
        int val = 3;

        // Function call

        System.out.println(removeElement(nums, val) + " ");
    }
}
