package com.borjaeg.java.it_books_api_wrapper;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ItBooksTest {

	/**
	 *  Seach Method Test
	 * 
	 */
	
	@Test
	public void testApp() {
		ItBooksClient cloud = new ItBooksClient();
		// Searching for Java Books =) =)
		String query = "Java";
		String jsonResults = cloud.search(query);
		assertTrue(cloud != null);
	}
}
