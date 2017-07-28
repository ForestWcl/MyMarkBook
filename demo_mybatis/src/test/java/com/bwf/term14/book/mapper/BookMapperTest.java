package com.bwf.term14.book.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.bwf.term14.book.domain.Book;
import com.bwf.term14.book.domain.Category;
import com.bwf.term14.book.vo.BookCondition;

public class BookMapperTest extends BaseMapperTest {
	
	private Logger logger = LogManager.getLogger(BookMapperTest.class);
	
	public void testAdd() {		
		
		List<Book> list = new ArrayList<Book>();
		list.add(new Book(null, "西游记", "无尘恩", 56.0, "人民教育出版社", "xyj.png", new Category(1, "小说")));
		list.add(new Book(null, "红楼梦", "曹雪芹", 98.0, "人民教育出版社", "xyj.png", new Category(1, "小说")));
		list.add(new Book(null, "水浒传", "施耐庵", 105.0, "人民教育出版社", "xyj.png", null));
		list.add(new Book(null, "三国演义", "罗贯中", 28.5, "人民教育出版社", "xyj.png", new Category(1, "小说")));

		BookMapper bookMapper = session.getMapper(BookMapper.class);
		bookMapper.add(list);
	}
	
	@Test	
	public void testGetBooks() {		
		BookMapper bookMapper = session.getMapper(BookMapper.class);
		logger.info("正在执行第1次bookMapper.getBooks方法");
		List<Book> bookList = bookMapper.getBooks(new BookCondition("三", null, 0, 5));
		for(Book b: bookList) {
			System.out.println(b);
		}
	}
	
	@Test	
	public void testGetBooks2() {
		BookMapper bookMapper = session.getMapper(BookMapper.class);
		logger.info("正在执行第2次bookMapper.getBooks方法");
		List<Book> bookList = bookMapper.getBooks(new BookCondition("三", null, 0, 5));
		for(Book b: bookList) {
			System.out.println(b);
		}
	}
		
}
