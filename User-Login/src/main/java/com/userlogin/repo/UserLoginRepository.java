package com.userlogin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.userlogin.entity.UserLoginEntity;

@Repository
@CrossOrigin("http://localhost:4200")
public interface UserLoginRepository extends JpaRepository<UserLoginEntity, Integer>{

}
