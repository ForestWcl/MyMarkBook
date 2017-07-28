package com.bwf.term14.book;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class SqlSessionFactoryTest {
	
	@Test
	public void testBuildSqlSessionFactory() {
		try {
			InputStream is = Resources.getResourceAsStream("mybatis/config.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			System.out.println("SqlSessionFactory构建成功：" + sqlSessionFactory);
			SqlSession session = sqlSessionFactory.openSession();
		
			// 根据AdminMapper接口创建其实例对象（使用了动态代理生成字节码）
			// 那就应该实现了getAdminByLoginId方法（反射）
			// AdminMapper adminMapper = session.getMapper(AdminMapper.class);
			
			/*
			Admin ad = new Admin(null, "wuchengen", "123566", "吴承恩");
			adminMapper.add(ad);
			System.out.println("\nadd 执行结束！");
			*/
			
			/*
			Admin admin = adminMapper.getAdminByLoginId("wuchengen");
			System.out.println("\ngetAdminByLoginId执行结束。admin:" + admin);
			*/
			
			session.commit();
			session.close();

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
