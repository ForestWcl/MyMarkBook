package com.bwf.term14.book.mapper;

import java.util.List;

import org.junit.Test;

import com.bwf.term14.book.domain.Book;
import com.bwf.term14.book.domain.Category;

public class CategoryMapperTest extends BaseMapperTest {
	
	@Test
	public void testGetAllCategories() {
		CategoryMapper categoryMapper = session.getMapper(CategoryMapper.class);
		List<Category> categoryList = categoryMapper.getAllCategories();
		for(Category c: categoryList) {
			System.out.println(c);
			for(Book b : c.getBooks()) {
				System.out.println("\t" + b);
			}
		}
	}
	
}
