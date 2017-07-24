package com.wuchanglin.web.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.wuchanglin.web.entity.Book;

public class BookMgr extends ActionSupport {

	private Book book;
	private String fileFileName;
	private File file;
	private String fileContentType;
	
	public String saveBookForm(){
		return SUCCESS;
	}
	
	public String saveBook() throws IOException{
		String savePath = ServletActionContext.getServletContext().getRealPath("/photo/")+"/"+fileFileName;
		FileUtils.copyFile(file, new File(savePath));
		return SUCCESS;	
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	

	public String getFileContentType() {
		return fileContentType;
	}
	

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}
	
	
}
