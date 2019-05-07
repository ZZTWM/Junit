package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.SumUtil;
import junit.framework.Assert;

public class TestCase01 {

	@Before
	public void before(){
		System.out.println("����ǰ��׼�������������������ݿ�ȵ�");
	}
	
	
	
	@Test
	public void testSum01(){
		int result = SumUtil.sum1(1, 2);
		Assert.assertEquals(result, 3);
	}
	
	@Test
	public void testSum02(){
		int result = SumUtil.sum2(1, 2, 3);
		Assert.assertEquals(result, 6);
	}
	
	
	@After
	public void after(){
		 System.out.println("���Խ�����Ĺ���������ر����ӵȵ�");
	}
	
}
