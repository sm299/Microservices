package com.ms1.SocialMedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms1.SocialMedia.bean.Users;
@Repository
public interface UserRepo extends JpaRepository<Users,Integer>{

}
