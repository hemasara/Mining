package com.mining.service;

import com.mining.exception.MiningException;
import com.mining.model.JSON.StoneInfo;

public interface StoneService {
	String saveStoneDetails(StoneInfo stoneInfo)throws MiningException;
}