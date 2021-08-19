package reverse_vowel_345;

import java.util.*;

public class Solution {


    public String reverseVowels(String s) {
        List<String> list = Arrays.asList("a","e","i","o","u","A","E","I","O","U");
        List<String> record = new ArrayList();
        List<String> index = new ArrayList();
        //将EOF 替换到元音位置
        for (char c : s.toCharArray()){
            if (list.contains(String.valueOf(c))){
                record.add("EOF");
                //记录被替换的原始元音
                index.add(String.valueOf(c));
            }else {
                record.add(String.valueOf(c));
            }
        }
        int i = index.size()-1;
        for (int j = 0 ;j<record.size();j++){
            //将为EOF反向填充元音
            if (record.get(j).equals("EOF")){
                record.set(j,index.get(i--));
            }
        }
        String res = "";
        for (String each : record){
            res+=each;
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(new Solution().reverseVowels(s));
    }
}
