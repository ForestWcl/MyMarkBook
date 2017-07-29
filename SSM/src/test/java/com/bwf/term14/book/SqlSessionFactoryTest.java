package com.bwf.term14.book;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class SqlSessionFactoryTest {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testBuildSqlSessionFactory() {
		System.out.println("sqlSessionFactory: " + sqlSessionFactory);
	}

}
