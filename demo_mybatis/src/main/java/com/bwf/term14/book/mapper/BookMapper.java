package com.bwf.term14.book.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bwf.term14.book.domain.Book;
import com.bwf.term14.book.vo.BookCondition;

public interface BookMapper {

	/**
	 * 分页查找符合图书分类及图书标题匹配条件的图书信息
	 * @param categoryName 分类名（如果为null、""、"全部"，则代表查找所有分类的）
	 * @param title 模糊图书名（如果null、""，则代表查找所有图书名的）
	 * @param firstResult
	 * @param pageSize
	 * @return
	 */
	List<Book> getBooks(@Param("condition") BookCondition bookCondition);
	
	void add(@Param("books") List<Book>books);
	
}
