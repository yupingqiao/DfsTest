package com.example.demo;

import com.yupqTest.DfsApp;
import com.yupqTest.dict.DefaultDict;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

//@RunWith(SpringRunner.class)
@SpringBootTest(classes = DfsApp.class)
class DfsTestApplicationTests extends TestCase {

	@Test
	public void testExample1(){
		System.out.println("test default dict!!!!");
		/**
		 * class {@link DefaultDict
		 * param null
		 * 默认字典
		 * */
		DefaultDict dict  = new DefaultDict();
		ArrayList<String> result = dict.wordBreak("ilikesamsungmobile",null);
		/**
		 * jdk1.8 新特性循环打印结果
		 * */
		result.stream().forEach(item -> System.out.println(item));
	}

	@Test
	void testExampleCustomized() {
		System.out.println("test testExampleCustomized dict!!!!");

		/**
		 * class {@link DefaultDict
		 * param dictionary
		 * 用户自定义字典
		 * */
		String dictionary[] = {"i","like","sam","sung","samsung","mobile","icecream","man","go","mango","and"};
		DefaultDict dict  = new DefaultDict();
		ArrayList<String> result = dict.wordBreak("ilikeicecreamandmango",dictionary);
		/**
		 * jdk1.8 新特性循环打印结果
		 * */
		result.stream().forEach(item -> System.out.println(item));
	}

	@Test
	public void testExampleCustomMer(){
		System.out.println("test testExampleCustomized dict!!!!");
		/**
		 * class {@link DefaultDict
		 * param dictionary
		 * 用户自定义字典
		 * */
		String dictionary[] = {"i", "like", "sam", "sung", "mobile", "icecream","ice","cream", "man","go", "mango","and"};
		DefaultDict dict  = new DefaultDict();
		ArrayList<String> result  = dict.wordBreak("ilikesamsungmobileandmango",dictionary);
		/**
		 * jdk1.8 新特性循环打印结果
		 * */
		result.stream().forEach(item -> System.out.println(item));
	}

}
