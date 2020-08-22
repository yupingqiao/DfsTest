package com.example.demo;

import com.yupqTest.DfsApp;
import com.yupqTest.dict.DefaultDict;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
@SpringBootTest(classes = DfsApp.class)
class DfsTestApplicationTests extends TestCase {

	@Test
	public void testExample1(){
		DefaultDict dict  = new DefaultDict();
		dict.wordBreak("ilikesamsungmobile",null);
	}

	@Test
	void testExampleCustomized() {
		String dictionary[] = {"i","like","sam","sung","samsung","mobile","icecream","man","go","mango","and"};
		DefaultDict dict  = new DefaultDict();
		dict.wordBreak("ilikeicecreamandmango",dictionary);
	}

	@Test
	public void testExampleCustomMer(){
		String dictionary[] = {"i", "like", "sam", "sung", "mobile", "icecream", "man go", "mango"};
		DefaultDict dict  = new DefaultDict();
		dict.wordBreak("ilikesamsungmobile",dictionary);
	}

}
