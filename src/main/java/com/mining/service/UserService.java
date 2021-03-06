package com.mining.service;

import java.util.List;

import com.mining.exception.MiningException;
import com.mining.model.JSON.StoneImageInfo;
import com.mining.model.JSON.UserInfo;

public interface UserService {
	
	String saveUser(UserInfo userInfo)throws MiningException;

	String loginUser(UserInfo user)throws MiningException;

	String forgotPassword(UserInfo user)throws MiningException;

	List<StoneImageInfo> getAllImages()throws MiningException;

	String getServerUrl() throws MiningException;
}
