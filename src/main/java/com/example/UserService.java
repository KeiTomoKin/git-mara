package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
	@Autowired 
	private UserRepository repository;
	
	public User load(Integer id) {
		return repository.load(id);
	}
}
