public class Question5 {
     //----------Find The Unique Count Element Of Array-----
     
    public static int unique(int nums[]){
        int i=0;
        for(int j=1; j<nums.length; j++){
            if(nums[i] <nums[j]){
                int temp = nums[i+1];
                nums[i+1] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i+1;
    }
public static void main(String[] args) {
    int nums [] = {0,1,1,1,2,2,3};
      System.out.println("Unique Element Of Array = " + unique(nums));
}

}
