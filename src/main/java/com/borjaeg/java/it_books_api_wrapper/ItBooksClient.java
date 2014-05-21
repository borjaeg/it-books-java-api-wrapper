package com.borjaeg.java.it_books_api_wrapper;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class ItBooksClient {

	public String search(String query) {
		String url = "http://it-ebooks-api.info/v1/search/";
		
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(UriBuilder.fromUri(url + query)
				.build());
		// getting JSON data
		System.out.println(service.path("restPath").path("resourcePath")
				.accept(MediaType.APPLICATION_JSON).get(String.class));
		
		return service.path("restPath").path("resourcePath")
				.accept(MediaType.APPLICATION_JSON).get(String.class);
	}
}
