package all_odd_arr_sum_1588;

import com.sun.tools.javac.util.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {


    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 1 ;i<= arr.length;i++){
            if (i % 2 != 0){
                sum += computerSum(arr,i);
            }
        }
        return sum;
    }

    public int computerSum(int arr[] ,int gap){
        int sum = 0;
        int left = 0 ,right = gap;
        for (;right <= arr.length; left++,right++){
            for (int j = left; j < right; j++) {
                sum += arr[j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int []arr = new int[]{1,4,2,5,3};
        int res = new Solution().sumOddLengthSubarrays(arr);
        System.out.println(res);
    }
}
