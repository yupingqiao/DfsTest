package com.yupqTest.util;

import java.util.ArrayList;

/**
 * @author yupq
 * @date 2020/8/22
 */
public class WordDfsUtil {
    public static String dictionary[] = {"i","like","sam","sung","samsung","mobile","ice","cream","man","go","mango"};

    public static boolean isContains(String word){
        int n = dictionary.length;
        for (int i = 0; i < n; i++){
            if (dictionary[i].equals(word)){
                return true;
            }
        }
        return false;
    }

    public static void wordBreak(String str,String[] dict){
        if(dict!=null){
            dictionary = dict;
        }
        ArrayList<String> arr = new ArrayList<String>();
        wordBreakUtil(str, arr);
    }
    public static void wordBreakUtil(String str,ArrayList<String> arr){
        int len = str.length();
        if(len == 0){
            System.out.println(arr);
            return;
        }
        //DFS
        for(int i = 1; i <= len; i++){
            String subStr = str.substring(0, i);
            if(isContains(subStr)){
                arr.add(subStr);
                wordBreakUtil(str.substring(i), arr);
                arr.remove(arr.size()-1);
            }
        }
    }

}
