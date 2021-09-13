package com.majon.sns_copy.user.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {

	public int insertUser(
			@Param("email") String email
			, @Param("name") String name
			, @Param("loginId") String loginId
			, @Param("password") String password); 
	
	public int countDuplicateId(@Param("loginId") String loginId);
	
}
