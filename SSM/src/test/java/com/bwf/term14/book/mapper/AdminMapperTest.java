package com.bwf.term14.book.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bwf.term14.book.domain.Admin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class AdminMapperTest {

	@Autowired
	private AdminMapper adminMapper;
	
	@Test
	public void testAdd() {
		Admin admin = new Admin(null, "zhangsanfeng", "3333", "章三丰");
		adminMapper.add(admin);
	}
	
}
