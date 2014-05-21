package com.borjaeg.java.it_books_api_wrapper;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class ItBooksClient {

	private Client client;
	private static final String URL = "http://it-ebooks-api.info/v1/";

	public ItBooksClient() {
		ClientConfig config = new DefaultClientConfig();
		client = Client.create(config);
	}

	public String search(String query) {
		query = "search/" + query;
		WebResource service = client.resource(URL + query);

		ClientResponse response = service.accept(MediaType.APPLICATION_JSON)
				.get(ClientResponse.class);

		if (response.getStatus() != 200) { // HTTP error
			System.err.println("ERROR");
			return null;
		} else {
			// getting JSON data
			String output = response.getEntity(String.class);
			return output;
		}
	}

	public String searchPage(String query, int page) {
		query = "search/" + query + "/page/" + page;
		WebResource service = client.resource(URL + query);

		ClientResponse response = service.accept(MediaType.APPLICATION_JSON)
				.get(ClientResponse.class);

		if (response.getStatus() != 200) { // HTTP error
			System.err.println("ERROR");
			return null;
		} else {
			// getting JSON data
			String output = response.getEntity(String.class);
			return output;
		}
	}

	public String searchBook(String id) {
		String query = "book/" + id;
		WebResource service = client.resource(URL + query);

		ClientResponse response = service.accept(MediaType.APPLICATION_JSON)
				.get(ClientResponse.class);

		if (response.getStatus() != 200) { // HTTP error
			System.err.println("ERROR");
			return null;
		} else {
			// getting JSON data
			String output = response.getEntity(String.class);
			return output;
		}
	}

}
