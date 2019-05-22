package com.hcl.shopperscard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.shopperscard.entity.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

}
