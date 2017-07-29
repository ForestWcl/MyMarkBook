package com.bwf.term14.book.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bwf.term14.book.domain.Admin;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class AdminServiceTest {
	
	@Autowired
	private AdminService adminService;

	@Test
	public void testLoginCheck() {
		Admin admin = new Admin(null, "zhangsanfeng3", "3333", "章三丰");
		System.out.println(adminService.save(admin));
	}
	
}
