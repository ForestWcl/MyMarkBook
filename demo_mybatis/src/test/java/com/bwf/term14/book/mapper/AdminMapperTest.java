package com.bwf.term14.book.mapper;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.bwf.term14.book.domain.Admin;

public class AdminMapperTest extends BaseMapperTest {

	public void testGetAdminNameDetails() {
		AdminMapper adminMapper = session.getMapper(AdminMapper.class);
		List<Map<String, Object>> nameDetailsList  = adminMapper.getAdminNameDetails();
		for(Map<String, Object> nameDetails : nameDetailsList) {
			System.out.println(nameDetails);
		}
	}

	@Test
	public void testGetAllAdmins() {
		AdminMapper adminMapper = session.getMapper(AdminMapper.class);		
		List<Admin> adminList  = adminMapper.getAllAdmins();
		for(Admin ad : adminList) {
			System.out.println(ad);
		}		
	}	
	
}
