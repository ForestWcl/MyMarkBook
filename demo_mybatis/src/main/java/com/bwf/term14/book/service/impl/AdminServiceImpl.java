package com.bwf.term14.book.service.impl;

import com.bwf.term14.book.domain.Admin;
import com.bwf.term14.book.mapper.AdminMapper;
import com.bwf.term14.book.service.AdminService;

public class AdminServiceImpl implements AdminService {
	
	private AdminMapper adminMapper;

	@Override
	public Admin loginCheck(String loginId, String loginPsw) {
		return null;
	}

	public AdminMapper getAdminMapper() {
		return adminMapper;
	}

	public void setAdminMapper(AdminMapper adminMapper) {
		this.adminMapper = adminMapper;
	}
	
	

	
}
