public class Question2 {

    /*
     * Question.2 = You are given two integer arrays nums1 and nums2, sorted in
     * non-decreasing order,
     * and two integers m and n, representing the number of elements in nums1 and
     * nums2 respectively.
     * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     */

    /*
     * Input: nums1 = [1,2,3,0,0,0],
     * m = 3,
     * nums2 = [2,5,6],
     * n = 3
     * 
     */

    /*
     * Solution =steps
     * step1.let i=m-1,j=n-1,k=m+n-1,
     * step2.check while (j>=0;)
     * step3.Comapre the nums1[i] > nums2[j] it is true then
     * step4.nums1[k] = nums1[i] and incresiing the i & k value i--,k--
     * step5. else{
     * nums1[k] = nums2[j] and incresiing the i & k value j--,k--
     * }
     * 
     */

    public static void mergeSortArray1(int nums1[], int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        // First solution
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    // Second solution

    public static void mergeSortArray2(int nums1[], int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            // compare the nums1 values to nums2 value

            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }

    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int nums2[] = { 2, 5, 6 };
        int n = 3;
        int m = 3;

        // First Method call

        mergeSortArray1(nums1, m, nums2, n);

        // Second method call
        mergeSortArray2(nums1, m, nums2, n);

        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}
