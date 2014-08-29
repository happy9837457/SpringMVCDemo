package com.palm.springmvc.service;

import com.palm.springmvc.bean.UserInfo;

/**
 * 
 * @author weixiang.qin
 * 
 */
public interface UserInfoService {
	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public UserInfo queryUserInfo(String username, String password);
}
