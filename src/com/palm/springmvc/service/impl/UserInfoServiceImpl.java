package com.palm.springmvc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.palm.springmvc.bean.UserInfo;
import com.palm.springmvc.dao.UserInfoDao;
import com.palm.springmvc.service.UserInfoService;
/**
 * 
 * @author weixiang.qin
 *
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
	@Resource
	private UserInfoDao userInfoDao;
	
	@Override
	public UserInfo queryUserInfo(String username, String password) {
		return userInfoDao.queryUserInfo(username, password);
	}

}
