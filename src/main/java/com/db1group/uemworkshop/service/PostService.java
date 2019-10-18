package com.db1group.uemworkshop.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.db1group.uemworkshop.domain.Post;

@Service
public class PostService {

	public Post findById(Integer id) {
		RestTemplate template = new RestTemplate();
		String url = "https://jsonplaceholder.typicode.com/posts/" + id;
		ResponseEntity<Post> response = template.getForEntity(url, Post.class);
		return response.getBody();
	}

}
