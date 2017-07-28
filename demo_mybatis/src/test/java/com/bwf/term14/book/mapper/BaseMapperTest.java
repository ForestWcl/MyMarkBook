package com.bwf.term14.book.mapper;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class BaseMapperTest {
	protected static SqlSessionFactory sqlSessionFactory;
	protected SqlSession session;
	
	@Before
	public void before() {
		session = sqlSessionFactory.openSession();
	}
	
	@After
	public void after() {
		session.commit();
		session.close();
	}
	
	@BeforeClass
	public static void init() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis/config.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
	}
}
