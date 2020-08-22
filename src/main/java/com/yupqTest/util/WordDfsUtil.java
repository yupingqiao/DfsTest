package com.yupqTest.util;

import java.util.ArrayList;

/**
 * @author yupq
 * @date 2020/8/22
 */
public class WordDfsUtil {

    public static boolean isContains(String word,String[] dictionary){
        int n = dictionary.length;
        for (int i = 0; i < n; i++){
            if (dictionary[i].equals(word)){
                return true;
            }
        }
        return false;
    }

    public static void wordBreak(String str,String[] dict){

        ArrayList<String> arr = new ArrayList<String>();
        wordBreakUtil(str, arr,dict);
    }
    public static void wordBreakUtil(String str,ArrayList<String> arr,String[] dictionary){
        int len = str.length();
        if(len == 0){
           // System.out.println(arr);
            arr.stream().forEach(item -> System.out.print(item+" "));
            System.out.println();
            return;
        }
        //DFS
        for(int i = 1; i <= len; i++){
            String subStr = str.substring(0, i);
            if(isContains(subStr,dictionary)){
                arr.add(subStr);
                wordBreakUtil(str.substring(i), arr,dictionary);
                arr.remove(arr.size()-1);
            }
        }
    }

}
