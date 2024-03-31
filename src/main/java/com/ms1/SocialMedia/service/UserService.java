package com.ms1.SocialMedia.service;

import java.util.List;

import com.ms1.SocialMedia.bean.Users;

public interface UserService {
 public List<Users> findAll();
 public Users save(Users user);
 public Users findOne(int id);
 
}
