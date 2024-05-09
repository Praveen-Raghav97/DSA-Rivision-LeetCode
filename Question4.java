public class Question4 {

    /*
     * Given an integer array nums sorted in non-decreasing order,
     * remove the duplicates in-place such that each unique element appears only
     * once.
     * The relative order of the elements should be kept the same.
     * Then return the number of unique elements in nums.
     */
    /*
     * Example 1:
     * 
     * Input: nums = [1,1,2]
     * Output: 2, nums = [1,2,_]
     * Explanation: Your function should return k = 2,
     * with the first two elements of nums being 1 and 2 respectively.
     * It does not matter what you leave beyond the returned k (hence they are
     * underscores).
     */

    /*
     * Solving Steps
     * if current element == next element{ Continue}
     * if current =! next elment = save the element
     * incresing the count of element
     */

    public static int removeDuplicate(int nums[]) {
        int k = 0;

        // Lopping on array.
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            } else {
                nums[k] = nums[i];
                k++;
            }

        }
        return k;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2 };

        System.out.println(removeDuplicate(nums) + " ");

    }
}
