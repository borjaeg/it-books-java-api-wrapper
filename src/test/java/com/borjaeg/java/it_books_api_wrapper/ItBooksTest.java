package com.borjaeg.java.it_books_api_wrapper;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ItBooksTest {

	/**
	 *  Seach Method Test
	 * 
	 */
	
	@Test
	public void testSearch() {
		ItBooksClient cloud = new ItBooksClient();
		// Searching for Java Books =) =)
		String query = "Java";
		String jsonResults = cloud.search(query);
		assertTrue(jsonResults != null);
		System.out.println(jsonResults);
	}
	
	@Test
	public void tesSearchPage() {
		ItBooksClient cloud = new ItBooksClient();
		// Searching for Java Books =) =)
		String query = "Java";
		int page = 10; // Page 2
		String jsonResults = cloud.searchPage(query, page);
		assertTrue(jsonResults != null);
		System.out.println(jsonResults);
	}
	
	
	@Test
	public void tesSearchBook() {
		ItBooksClient cloud = new ItBooksClient();
		String idBook = "4219242634";
		String jsonResults = cloud.searchBook(idBook);
		assertTrue(jsonResults != null);
		System.out.println(jsonResults);
	}
	
}
