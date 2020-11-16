package com.pulidom.models;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class PostRequest {
	
	private String title;
	private String body;
	
}
