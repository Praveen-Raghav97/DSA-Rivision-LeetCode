public class Question3 {

    /* Question 3. Remove Element in Array.
     * You are given two integer arrays nums1 and nums2, 
     * sorted in non-decreasing order, and two integers m and n,
     *  representing the number of elements in nums1 and nums2 respectively
     */
    /*


     * Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]

Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1
     */

    public static int removeElement(int nums[], int val){

        int k =0;
        //looping on array
        for(int i=0; i<nums.length; i++){
            //Check value val = array[i] value

            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
    public static void main(String[] args) {
        int nums[] ={3,2,2,3};
        int val = 3;
          
       //Function call

       System.out.println(removeElement(nums, val) + " ");
    }
}
