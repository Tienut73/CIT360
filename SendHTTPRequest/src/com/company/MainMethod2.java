package com.company;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONArray;
import org.json.JSONObject;
	
public class MainMethod2 {
	public static void main(String[] args)	{
	//Create client
	HttpClient client = HttpClient.newHttpClient();
	//Build Request
	HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/albums")).build();
	// Send Asyncronous Request using client. Receive response as a string.
	client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
	//Once response is received, apply the method to the result.
	// :: means we want to use body method on the previous result.
	.thenApply(HttpResponse::body) 
	.thenAccept(System.out::println)
	// Return the results to our console.
	.join();
	
	}
	
	public static String parse(String responseBody) {
		JSONArray albums = new JSONArray(responseBody);
		for (int i = 0; i < albums.length(); i++) {
			JSONObject album = albums.getJSONObject(i);
			int id = album.getInt("id");
			int userId = album.getInt("userId");
			String title = album.getString("title");
			System.out.println(id + " " + title + " " + userId);
		}
		return null;
	}
}
	
