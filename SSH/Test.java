package com.bwf.book.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bwf.book.entity.Admin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class Test {
	
	@Autowired
	private AdminService adminService;

	@Test
	public void testAddNewAdmin() {
		Admin admin = new Admin();
		admin.setLoginId("liuxiaogang");
		admin.setLoginPsw("ok1234");
		admin.setName("刘小刚");
		adminService.addNewAdmin(admin);	
	}
}
