package com.palm.springmvc.dao;

import com.palm.springmvc.bean.UserInfo;

/**
 * 
 * @author weixiang.qin
 * 
 */
public interface UserInfoDao {
	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public UserInfo queryUserInfo(String username, String password);
}
