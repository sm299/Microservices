package com.ms1.SocialMedia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms1.SocialMedia.bean.Users;
import com.ms1.SocialMedia.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepo repo;
	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Users save(Users user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	@Override
	public Users findOne(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	

}
