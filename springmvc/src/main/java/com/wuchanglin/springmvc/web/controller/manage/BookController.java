package com.wuchanglin.springmvc.web.controller.manage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wuchanglin.springmvc.service.BookService;
import com.wuchanglin.springmvc.entity.Book;

@Controller
@RequestMapping("/manage/book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/mgr")
	public String mgr(){
		return "manage/bookmgr";
	}
	
	@ResponseBody
	@RequestMapping("/list")
	public List<Book> list(){
		return bookService.getBookList();
	}

	public BookService getBookService() {
		return bookService;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	
	
}
