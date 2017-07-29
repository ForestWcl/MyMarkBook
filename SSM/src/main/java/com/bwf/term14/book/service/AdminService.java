package com.bwf.term14.book.service;

import com.bwf.term14.book.domain.Admin;

public interface AdminService {
	
	Admin loginCheck(String loginId, String loginPsw);
	
	boolean save(Admin admin);
	
}


