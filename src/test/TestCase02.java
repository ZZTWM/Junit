package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.SumUtil;
import junit.framework.Assert;

public class TestCase02 {

	@Before
	public void before(){
		System.out.println("测试前的准备工作，比如链接数据库等等");
	}
	
	
	
	@Test
	public void testSum01(){
		int result = SumUtil.sum1(1, 2);
		Assert.assertEquals(result, 3);
	}
	
	@Test
	public void testSum02(){
		int result = SumUtil.sum2(1, 2, 3);
		Assert.assertEquals(result, 5);
	}
	
	
	@After
	public void after(){
		 System.out.println("测试结束后的工作，比如关闭链接等等");
	}
	
}
