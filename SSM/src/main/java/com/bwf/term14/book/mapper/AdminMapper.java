package com.bwf.term14.book.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.bwf.term14.book.domain.Admin;

public interface AdminMapper {
	
	Admin getAdminByLoginId(String loginId);
	
	List<Admin> getAllAdmins();
	
	List<Map<String, Object>> getAdminNameDetails();
	
	void add(@Param("admin")Admin admin);
	
}
