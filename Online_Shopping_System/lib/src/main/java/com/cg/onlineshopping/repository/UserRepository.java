package com.cg.onlineshopping.repository;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import com.cg.onlineshopping.entities.Login;

	@Repository
	public interface UserRepository extends JpaRepository<Login, String>{
		Login findByUserId(String userid);
		

	}


