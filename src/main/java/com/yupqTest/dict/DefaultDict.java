package com.yupqTest.dict;

import com.yupqTest.util.WordDfsUtil;

import java.util.ArrayList;

/**
 * @author yupq
 * @date 2020/8/22
 * context dict
 * */
public class DefaultDict {
    public static String dictionary[] = {"i","like","sam","sung","samsung","mobile","ice","cream","man","go","mango"};

    public void wordBreak(String s,String[] dict){
        if(dict == null){
            dict = dictionary;
        }
        WordDfsUtil.wordBreak(s,dict);
    }
}
