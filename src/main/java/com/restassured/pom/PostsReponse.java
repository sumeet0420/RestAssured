package com.restassured.pom;

import java.util.List;

import com.restassured.utilities.SupportUtilities;

import io.restassured.path.json.JsonPath;

public class PostsReponse {

	public PostsReponse() {
		super();
	}

	public static Posts getPostsById(String response, int id) {
		JsonPath json = SupportUtilities.parseJson(response);
		Posts post_return = null;
		List<Integer> posts = json.getList("id");
		for (int i = 0; i < posts.size(); i++) {
			int idTemp = posts.get(i);
			if (idTemp == id) {
				post_return = new Posts((int) json.getList("userId").get(i), id, (String) json.getList("title").get(i),
						(String) json.getList("body").get(i));
			}
		}
		return post_return;
	}
}