
//Question 1. = Find the medain of two sorted arrays.
// Array{leat-code problem. = Hard}


   
//Solution. Steps
// Step1. Merge the two arrays into a single sorted array.
//Step2. If the combined size of the two arrays is odd, the median is the middle element of the merged array.
//Step3. If the combined size is even, the median is the average of the two middle elements.

public class Question1 {   


    public static double medianSortedArray(int[] num1, int[] num2){
        
        int totalLength = num1.length + num2.length;
        int margedArray [] = new int [totalLength];

        int i=0;
        int j =0;
        int k=0;


        while (i < num1.length && j<num2.length) {
            if (num1[i] <=totalLength) {
                margedArray[k++] = num1[i++];
            }else{
                margedArray[k++] = num2[j++];
            }
        }

        while (i <num1.length) {
            margedArray[k++]= num1[i++];

        }
        while (j< num2.length) {
            margedArray[k++] = num2[j++];
        }

        //Check the median

        if (totalLength %2 !=0) {
            return margedArray[totalLength / 2];
        }else{
            int mid1 = totalLength /2-1;
            int mid2 = totalLength /2;
            return (margedArray[mid1]+ margedArray[mid2]);
        }
    }
    public static void main(String[] args) {
        int num1 [] = {1,3};
        int num2 [] = {2};

        System.out.println("The median is " + medianSortedArray(num1, num2));
    }
}