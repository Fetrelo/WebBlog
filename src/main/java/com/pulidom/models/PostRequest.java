package com.pulidom.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class PostRequest {
	
	private String title;
	private String body;
	
}
