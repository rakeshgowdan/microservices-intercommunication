package com.rakesh.microservicesintercommunication.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Users {
	
	private int id;
	 private String name;
	 private String type;
	 private String location;
	 private String avatar_url;
	 private String url;

}
