package com.mining.dao;

import java.util.List;

import com.mining.exception.MiningException;
import com.mining.model.User;
import com.mining.model.JSON.StoneImageInfo;
import com.mining.model.JSON.UserInfo;

public interface UserDAO {
	
	String saveUser(User user)throws MiningException;
	UserInfo loginUser(UserInfo userInfo)throws MiningException;
	UserInfo forgotPassword(UserInfo userInfo)throws MiningException;
	List<StoneImageInfo> getAllImages()throws MiningException;
}
