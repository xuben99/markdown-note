# 1588. 所有奇数长度子数组的和

## 用时记录
> 开始 2021-08-29 13-39:00
> 结束 2021-08-29 14-04:00  用时26m
> 
## 题目说明
```java
给你一个正整数数组 arr ，请你计算所有可能的奇数长度子数组的和。

        子数组 定义为原数组中的一个连续子序列。

        请你返回 arr 中 所有奇数长度子数组的和 。

         

        示例 1：

        输入：arr = [1,4,2,5,3]
        输出：58
        解释：所有奇数长度子数组和它们的和为：
        [1] = 1
        [4] = 4
        [2] = 2
        [5] = 5
        [3] = 3
        [1,4,2] = 7
        [4,2,5] = 11
        [2,5,3] = 10
        [1,4,2,5,3] = 15
        我们将所有值求和得到 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
        示例 2：

        输入：arr = [1,2]
        输出：3
        解释：总共只有 2 个长度为奇数的子数组，[1] 和 [2]。它们的和为 3 。
        示例 3：

        输入：arr = [10,11,12]
        输出：66
         

        提示：

        1 <= arr.length <= 100
        1 <= arr[i] <= 1000

        来源：力扣（LeetCode）
        链接：https://leetcode-cn.com/problems/sum-of-all-odd-length-subarrays
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
```

```JAVA
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
```

## 提交结果

![img.png](img.png)







