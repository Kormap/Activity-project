package com.activity.service;

import java.util.List;
import com.activity.domain.UserDTO;

public interface UserService {
	
	//유저 정보 리스트 
	public List<UserDTO> getUserList() throws Exception;
	
	//회원가입 정보 insert
	public void insertUser(UserDTO userdto) throws Exception;
}
 

