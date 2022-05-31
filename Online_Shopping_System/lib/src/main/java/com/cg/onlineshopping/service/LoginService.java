package com.cg.onlineshopping.service;

	import com.cg.onlineshopping.entities.Login;

	public interface LoginService {
		
		Login findByUserId(String userid);

	}

