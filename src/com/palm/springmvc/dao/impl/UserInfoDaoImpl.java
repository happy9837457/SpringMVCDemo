package com.palm.springmvc.dao.impl;

import java.util.Date;

import org.springframework.stereotype.Repository;

import com.palm.springmvc.bean.UserInfo;
import com.palm.springmvc.dao.UserInfoDao;

/**
 * 
 * @author weixiang.qin
 * 
 */
@Repository("userInfoDao")
public class UserInfoDaoImpl implements UserInfoDao {

	@Override
	public UserInfo queryUserInfo(String username, String password) {
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId(10000000);
		userInfo.setUsername(username);
		userInfo.setPassword(password);
		userInfo.setCreateTime(new Date());
		return userInfo;
	}

}
