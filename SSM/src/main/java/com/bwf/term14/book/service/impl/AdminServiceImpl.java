package com.bwf.term14.book.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bwf.term14.book.domain.Admin;
import com.bwf.term14.book.mapper.AdminMapper;
import com.bwf.term14.book.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminMapper adminMapper;

	@Override
	public Admin loginCheck(String loginId, String loginPsw) {
		Admin admin = adminMapper.getAdminByLoginId(loginId);
		if(admin != null && admin.getLoginPsw().equals(loginPsw)) {
			return admin;
		}
		return null;
	}

	@Override
	public boolean save(Admin admin) {
		if(adminMapper.getAdminByLoginId(admin.getLoginId()) == null) {
			adminMapper.add(admin);
			return true;
		}
		return false;
	}
	

	public AdminMapper getAdminMapper() {
		return adminMapper;
	}

	public void setAdminMapper(AdminMapper adminMapper) {
		this.adminMapper = adminMapper;
	}
	

	
}
