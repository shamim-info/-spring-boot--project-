package com.Online_book_Store.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Online_book_Store.entity.UserEntity;
@RestController
public class UserController {
	public static UserEntity insert (@RequestBody UserEntity userEntity) {
		
		return null;
		
	}
	}

