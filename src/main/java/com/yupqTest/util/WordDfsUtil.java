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

    public static ArrayList<String> wordBreak(String str,String[] dict){

        ArrayList<String> arr = new ArrayList<String>();
        ArrayList<String> result = new ArrayList<String>();
        wordBreakUtil(str, arr,dict,result);
        return result;
    }
    public static void wordBreakUtil(String str,ArrayList<String> arr,String[] dictionary,ArrayList<String> result){
        int len = str.length();
        if(len == 0){
            String res = "";
            for(int i=0;i<arr.size();i++){
                res += arr.get(i);
                if(i != arr.size() -1){
                    res += " ";
                }
            }
            result.add(res);
            return;
        }
        //DFS
        for(int i = 1; i <= len; i++){
            String subStr = str.substring(0, i);
            if(isContains(subStr,dictionary)){
                arr.add(subStr);
                wordBreakUtil(str.substring(i), arr,dictionary,result);
                arr.remove(arr.size()-1);
            }
        }
    }

}
