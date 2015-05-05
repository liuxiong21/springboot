package org.soulcoder.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserServiceTest {

	private String datas[];
	
	@Before
	public void initDatabase(){
		datas = new String[3];
		datas[0] = "line1";
		datas[1] = "line1";
		datas[2] = "line1";
	}
	
	@Test
	public void testCount(){
		Assert.assertEquals(3, datas.length);
	}
}
